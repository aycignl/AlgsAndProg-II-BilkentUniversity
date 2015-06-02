package week3;

/*
 * username: Gonul
 * e-mail: gonul.ayci90@gmail.com
 * from Bilkent University Computer Science Algorithms&ProgrammingII video lectures.
 */

import javax.swing.JFrame;

public class Splat {
    
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Splat");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new SplatPanel());
        frame.pack();
        frame.setVisible(true);
    }
}
