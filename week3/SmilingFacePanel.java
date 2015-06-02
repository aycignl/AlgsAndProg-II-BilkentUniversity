package week3;

/*
 * username: Gonul
 * e-mail: gonul.ayci90@gmail.com
 * from Bilkent University Computer Science Algorithms&ProgrammingII video lectures.
 */


import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;

public class SmilingFacePanel extends JPanel {
    
    //Demonstrates the use of a seperate panel class.
    
    private final int BASEX = 120, BASEY = 60; // Base point for head
    
    public SmilingFacePanel(){
        setBackground(Color.blue);
        setPreferredSize(new Dimension(320, 200));
        setFont(new Font("Arial", Font.BOLD, 16));
    }


    //Draws a face
    
    public void paintComponent(Graphics page){
        super.paintComponent(page);
        
        page.setColor(Color.yellow);
        page.fillOval(BASEX, BASEY, 80, 80); //head
        page.fillOval(BASEX-5, BASEY+20, 90, 40); //ears
        
        page.setColor(Color.black);
        page.drawOval(BASEX+20, BASEY+30, 15, 7); //eyes
        page.drawOval(BASEX+45, BASEY+30, 15, 7);

        page.fillOval(BASEX+25 , BASEY+31, 5, 5); //pupils
        page.fillOval(BASEX+50, BASEY+31, 5, 5);
    
        page.drawArc(BASEX+20, BASEY+25, 15, 7, 0, 180); //eyebrows
        page.drawArc(BASEX+45, BASEY+25, 15, 7, 0, 180);
        
        page.drawArc(BASEX+35, BASEY+40, 15, 10, 180, 180); //nose
        page.drawArc(BASEX+20, BASEY+50, 40, 15, 180, 180); //mouth
        
        page.setColor(Color.white);
        page.drawString("Always remember that you are unique!", BASEX-105, BASEY-15);
        page.drawString("Just like everyone else.", BASEX-45, BASEY+105);
        
        
    }

}
