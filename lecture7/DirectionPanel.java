package lecture7;

//********************************************************************
// DirectionPanel.java Author: Lewis/Loftus
//
// Represents the primary display panel for the Direction program.
//********************************************************************
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DirectionPanel extends JPanel {

    private final int WIDTH = 300, HEIGHT = 200;
    private final int JUMP = 10; // increment for image movement
    private final int IMAGE_SIZE = 31;
    private ImageIcon up, down, right, left, currentImage;
    private int x, y;
//-----------------------------------------------------------------
// Sets up this panel and loads the images.
//-----------------------------------------------------------------
    public DirectionPanel(JApplet applet) {
        applet.addKeyListener(new DirectionListener());
        x = WIDTH / 2;
        y = HEIGHT / 2;
        up = new ImageIcon("arrowUp.gif");
        down = new ImageIcon("arrowDown.gif");
        left = new ImageIcon("arrowLeft.gif");
        right = new ImageIcon("arrowRight.gif");
        currentImage = right;
        setBackground(Color.black);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }
//-----------------------------------------------------------------
// Draws the image in the current location.
//-----------------------------------------------------------------
    public void paintComponent(Graphics page) {
        super.paintComponent(page);
        currentImage.paintIcon(this, page, x, y);
    }
//*****************************************************************
// Represents the listener for keyboard activity.
//*****************************************************************
    private class DirectionListener implements KeyListener {
//--------------------------------------------------------------
// Responds to the user pressing arrow keys by adjusting the
// image location accordingly.
//--------------------------------------------------------------
        public void keyPressed(KeyEvent event) {
            switch (event.getKeyCode()) {
                case KeyEvent.VK_UP:
                    currentImage = up;
                    if (y > 0) {
                        y -= JUMP;
                    }
                    break;
                case KeyEvent.VK_DOWN:
                    currentImage = down;
                    if (y < HEIGHT - IMAGE_SIZE) {
                        y += JUMP;
                    }
                    break;
                case KeyEvent.VK_LEFT:
                    currentImage = left;
                    if (x > 0) {
                        x -= JUMP;
                    }
                    break;
                case KeyEvent.VK_RIGHT:
                    currentImage = right;
                    if (x < WIDTH - IMAGE_SIZE) {
                        x += JUMP;
                    }
                    break;
            }
            repaint();
        }
//--------------------------------------------------------------
// Provide empty definitions for unused event methods.
//--------------------------------------------------------------
        public void keyTyped(KeyEvent event) {
        }

        public void keyReleased(KeyEvent event) {
        }
    }
}