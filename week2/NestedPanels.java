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

public class NestedPanels {
    public static void main(String[] args){
        JFrame frame = new JFrame("Nested Panels");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel subPanel1 = new JPanel();
        subPanel1.setPreferredSize(new Dimension(150, 100));
        subPanel1.setBackground(Color.green);
        
        JLabel label1 = new JLabel("one");
        subPanel1.add(label1);
        
        JPanel subPanel2 = new JPanel();
        subPanel2.setPreferredSize(new Dimension(150, 100));
        subPanel2.setBackground(Color.red);
        
        JLabel label2 = new JLabel("two");
        subPanel2.add(label2);
        
        JPanel panel = new JPanel();
        panel.setBackground(Color.blue);
        panel.add(subPanel1);
        panel.add(subPanel2);
        
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
        
    }
}
