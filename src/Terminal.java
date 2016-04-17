import javax.swing.*;

/**
 * Created by test on 2016-04-17.
 */
public class Terminal extends JFrame{
    private JTextArea display;
    private JPanel panel1;

    public Terminal(){
        //super("Terminal");
        setContentPane(panel1);

        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        setVisible(true);
    }

}
