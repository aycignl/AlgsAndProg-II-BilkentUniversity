package lecture7;



//********************************************************************
// DotsPanel.java Author: Lewis/Loftus
//
// Represents the primary panel for the Dots program on which the
// dots are drawn.
//********************************************************************
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class DotsPanel extends JPanel {

    private final int WIDTH = 300, HEIGHT = 200;
    private final int RADIUS = 6;
    private ArrayList pointList;
    private int count;
    
//-----------------------------------------------------------------
// Sets up this panel to listen for mouse events.
//-----------------------------------------------------------------
    public DotsPanel() {
        pointList = new ArrayList();
        count = 0;
        addMouseListener(new DotsListener());
        setBackground(Color.black);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }
    
//-----------------------------------------------------------------
// Draws all of the dots stored in the list.
//-----------------------------------------------------------------
    public void paintComponent(Graphics page) {
        super.paintComponent(page);
        page.setColor(Color.green);
// Retrieve an iterator for the ArrayList of points
        Iterator pointIterator = pointList.iterator();
        while (pointIterator.hasNext()) {
            Point drawPoint = (Point) pointIterator.next();
            page.fillOval(drawPoint.x - RADIUS, drawPoint.y - RADIUS,
                    RADIUS * 2, RADIUS * 2);
        }
        page.drawString("Count: " + count, 5, 15);
    }
    
//*****************************************************************
// Represents the listener for mouse events.
//*****************************************************************
    private class DotsListener implements MouseListener {
//--------------------------------------------------------------
// Adds the current point to the list of points and redraws
// whenever the mouse button is pressed.
//--------------------------------------------------------------
        public void mousePressed(MouseEvent event) {
            pointList.add(event.getPoint());
            count++;
            repaint();
        }
        
//---------------------------------------------------------------
// Provide empty definitions for unused event methods.
//---------------------------------------------------------------
        public void mouseClicked(MouseEvent event) {
        }

        public void mouseReleased(MouseEvent event) {
        }

        public void mouseEntered(MouseEvent event) {
        }

        public void mouseExited(MouseEvent event) {
        }
    }
}