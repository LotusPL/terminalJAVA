/**
 * Created by test on 2016-04-21.
 */
import java.io.IOException;
import java.net.URL;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Commands implements CommandsInterface {
    Main main;
    Terminal console;
    @Override
    public void cdCommand() {
        console.display.getText();

    }

    @Override
    public void currentWorkingDirectory() {

    }

    @Override
    public void resetCommand() {

    }

    @Override
    public String defaultWorkingDirectory() {

        URL workingDirectory = Commands.class.getProtectionDomain().getCodeSource().getLocation();
        return workingDirectory.getFile();
        //return null;
    }
    @Override
    public String defaultWorkingDirectory2(){
        //String userName = System.getProperty("user.name");
        //String buildPath = "C:\\Users\\" + userName + "\\Documents\\GitHub\\terminalJAVA";
        String buildPath = System.getProperty("user.dir");

        Path defaultPath = Paths.get(buildPath);
        return defaultPath.toString();
    }



    public Path pathDirectory(){
        Path p1 = Paths.get("user.dir");
        return p1;
    }
    public static List<String> fileList(String directory){
        List<String> fileNames = new ArrayList<>();
        try (DirectoryStream<Path> directoryStream = Files.newDirectoryStream(Paths.get(directory))) {
            for (Path path : directoryStream) {
                fileNames.add(path.toString());
            }
        } catch (IOException ex) {}
        return fileNames;
    }
    public List<Path> getDirectories(final Path dir) throws IOException {
        final List<Path> dirlist = new ArrayList<>();
        try (DirectoryStream<Path> stream = Files.newDirectoryStream(dir)) {
            for (final Iterator<Path> it = stream.iterator(); it.hasNext();) {
                dirlist.add(dir.resolve(it.next()));
            }
        }
        return dirlist;
    }
}
