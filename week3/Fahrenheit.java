package week3;

import javax.swing.JFrame;

/*
 * username: Gonul
 * e-mail: gonul.ayci90@gmail.com
 * from Bilkent University Computer Science Algorithms&ProgrammingII video lectures.
 */

// Creates and displays the temperature converter GUI.
public class Fahrenheit {
    
    public static void main(String[] args){
        
        JFrame frame = new JFrame("Fahrenheit");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        FahrenheitPanel panel = new FahrenheitPanel();
        
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
        
    }
    
}
