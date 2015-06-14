package week5;
/*
 * username: Gonul
 * e-mail: gonul.ayci90@gmail.com
 * from Bilkent University Computer Science Algorithms&ProgrammingII video lectures.
 */

import java.awt.Color;
import javax.swing.JFrame;

// Demonstrates the use of check boxes.
public class StyleOptions {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Style Options");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().add(new StyleOptionsPanel());

        frame.pack();
        frame.setVisible(true);

    }
}
