import java.nio.file.Path;
import java.util.List;

/**
 * Created by test on 2016-04-17.
 */
//TODO create interface for terminal commands
public interface CommandsInterface  {
    void cdCommand();
    void currentWorkingDirectory();
    void resetCommand();
    String defaultWorkingDirectory();
    String defaultWorkingDirectory2();


}
