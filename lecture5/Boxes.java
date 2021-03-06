package lecture5;
/*
 * username: Gonul
 * e-mail: gonul.ayci90@gmail.com
 * from Bilkent University Computer Science Algorithms&ProgrammingII video lectures.
 */

//********************************************************************
// Boxes.java Author: Lewis/Loftus
//
// Demonstrates the use of conditionals and loops to guide drawing.
//********************************************************************

import javax.swing.JFrame;

// Creates the main frame of the program.
public class Boxes {

    public static void main(String[] args) {

        JFrame frame = new JFrame("Boxes");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BoxesPanel panel = new BoxesPanel();
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
