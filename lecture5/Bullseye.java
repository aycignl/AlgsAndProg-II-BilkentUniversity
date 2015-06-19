package lecture5;
/*
 * username: Gonul
 * e-mail: gonul.ayci90@gmail.com
 * from Bilkent University Computer Science Algorithms&ProgrammingII video lectures.
 */
//********************************************************************
// Bullseye.java Author: Lewis/Loftus
//
// Demonstrates the use of conditionals and loops to guide drawing.
//********************************************************************

import javax.swing.JFrame;

public class Bullseye {

    // Creates the main frame of the program.
    public static void main(String[] args) {

        JFrame frame = new JFrame("Bullseye");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        BullseyePanel panel = new BullseyePanel();

        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);


    }
}
