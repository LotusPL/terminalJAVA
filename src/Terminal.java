import javax.swing.*;

/**
 * Created by test on 2016-04-17.
 */
public class Terminal extends JFrame{
    private JTextArea display;
    private JPanel panel1;
    private JTextField textField1;
    Commands comm = new Commands();
    String command;
    public Terminal(){
        super("Terminal");
        setContentPane(panel1);

        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        display.setEditable(true);

        display.setText(comm.defaultWorkingDirectory()+">");
        command = display.getText();

        //System.out.println(command);
        display.grabFocus();
        setVisible(true);
    }

}
