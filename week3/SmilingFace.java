package week3;

/*
 * username: Gonul
 * e-mail: gonul.ayci90@gmail.com
 * from Bilkent University Computer Science Algorithms&ProgrammingII video lectures.
 */

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SmilingFace {

    //Creates the main frame of the program.
    
    public static void main(String[] args){
        
        JFrame frame = new JFrame("Smiling Face");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        SmilingFacePanel panel = new SmilingFacePanel();
        /*
         * If you want to draw two faces :
        SmilingFacePanel panel2 = new SmilingFacePanel();
        JPanel panel = new JPanel();
        panel.add(panel1);
        panel.add(panel2);
        */
        frame.getContentPane().add(panel);
        
        frame.pack();
        frame.setVisible(true);
        
        
    }

}
