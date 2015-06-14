package week5;
/*
 * username: Gonul
 * e-mail: gonul.ayci90@gmail.com
 * from Bilkent University Computer Science Algorithms&ProgrammingII video lectures.
 */

import javax.swing.JFrame;

// Demostrates the use of one listener for multiple buttons.

public class LeftRight {

    public static void main(String[] args){
    
        JFrame frame = new JFrame("Left Right");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        frame.getContentPane().add(new LeftRightPanel());
        
        frame.pack();
        frame.setVisible(true);
        
    }
}
