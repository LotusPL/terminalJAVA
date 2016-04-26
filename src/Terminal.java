import javax.swing.*;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by test on 2016-04-17.
 */
public class Terminal extends JFrame{
    public JTextArea display;
    private JPanel panel1;
    private JTextField textField1;
    Commands comm = new Commands();
    String command;
    public Terminal() throws IOException {
        super("Terminal");
        setContentPane(panel1);

        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        display.setEditable(true);
        for(int i=0;i<comm.fileList(comm.defaultWorkingDirectory2()).size();i++){
            display.append(comm.fileList(comm.defaultWorkingDirectory2()).get(i));
            display.append("\n");

        }

        //display.setText(comm.defaultWorkingDirectory()+">");
        //display.setText("\n" + lista);
        command = display.getText();

        //System.out.println(command);
        display.grabFocus();
        setVisible(true);
    }

}
