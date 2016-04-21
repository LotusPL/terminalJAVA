/**
 * Created by test on 2016-04-21.
 */
import java.nio.file.Path;
import java.nio.file.Paths;

public class Commands implements CommandsInterface {
    @Override
    public void cdCommand() {

    }

    @Override
    public void currentWorkingDirectory() {

    }

    @Override
    public void resetCommand() {

    }

    @Override
    public String defaultWorkingDirectory() {
        String userName = System.getProperty("user.name");
        String buildPath = "C:\\Users\\" + userName + "\\Documents\\GitHub\\terminalJAVA";
        Path defaultPath = Paths.get(buildPath);
        return defaultPath.toString();
    }
}
