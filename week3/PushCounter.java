package week3;

/*
 * username: Gonul
 * e-mail: gonul.ayci90@gmail.com
 * from Bilkent University Computer Science Algorithms&ProgrammingII video lectures.
 */
import javax.swing.JFrame;

public class PushCounter {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Push Counter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new PushCounterPanel());

        frame.pack();
        frame.setVisible(true);

    }
}
