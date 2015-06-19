package lecture5;
/*
 * username: Gonul
 * e-mail: gonul.ayci90@gmail.com
 * from Bilkent University Computer Science Algorithms&ProgrammingII video lectures.
 */

import javax.swing.JFrame;

// Demonstrates the use of radio buttons
public class QuoteOptions {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Quote Options");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(new QuoteOptionsPanel());
        frame.pack();
        frame.setVisible(true);
    }
}
