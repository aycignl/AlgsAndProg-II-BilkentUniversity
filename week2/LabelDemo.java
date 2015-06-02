package week2;

/*
 * username: Gonul
 * e-mail: gonul.ayci90@gmail.com
 * from Bilkent University Computer Science Algorithms&ProgrammingII video lectures.
 */

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class LabelDemo {
    public static void main(String[] args){
        
        JFrame frame = new JFrame("Nested Panels");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        ImageIcon icon1 = new ImageIcon("src/studies/xicon.jpg");
        ImageIcon icon2 = new ImageIcon("src/studies/oicon.jpg");
        
        JLabel label1, label2, label3;
        label1 = new JLabel("Devil Left", icon1, SwingConstants.CENTER);
        
        label2 = new JLabel("Devil Right", icon1, SwingConstants.CENTER);
        label2.setHorizontalTextPosition(SwingConstants.LEFT);
        label2.setVerticalTextPosition(SwingConstants.BOTTOM);
        
        label3 = new JLabel("Devil Above", icon2, SwingConstants.CENTER);
        label3.setHorizontalTextPosition(SwingConstants.CENTER);
        label3.setVerticalTextPosition(SwingConstants.BOTTOM);
        
        JPanel panel = new JPanel();
        panel.setBackground(Color.cyan);
        panel.setPreferredSize(new Dimension(250, 250));
        panel.add(label1);
        panel.add(label2);
        panel.add(label3);
        
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
