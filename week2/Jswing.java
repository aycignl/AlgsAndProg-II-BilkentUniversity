package week2;

/*
 * username: Gonul
 * e-mail: gonul.ayci90@gmail.com
 * from Bilkent University Computer Science Algorithms&ProgrammingII video lectures.
 */

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class Jswing {

    public static void main(String[] args){
        JFrame frame = new JFrame("Authority");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        panel.setBackground(Color.red);
        panel.setPreferredSize(new Dimension(250, 100));
        
        JLabel label1 = new JLabel("Question authority, ");
        JLabel label2 = new JLabel("but raise your hand first. ");
        
        panel.add(label1);
        panel.add(label2);
        
        frame.getContentPane().add(panel);
        //set the size on frame, fix on to-get the exact size.
        //eger pack olmazsa kucucuk cikacak panel.
        frame.pack();
        frame.setVisible(true);
        //frame.show() is the same setvisible-true;
    }
    
}


