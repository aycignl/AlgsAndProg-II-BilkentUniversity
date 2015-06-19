package lecture5;
/*
 * username: Gonul
 * e-mail: gonul.ayci90@gmail.com
 * from Bilkent University Computer Science Algorithms&ProgrammingII video lectures.
 */

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

class BullseyePanel extends JPanel {

    private final int MAX_WIDTH = 300, NUM_RINGS = 10, RING_WIDTH = 12;

    // Sets up the bullseye panel.
    public BullseyePanel() {

        setBackground(Color.cyan);
        setPreferredSize(new Dimension(300, 300));

    }

    // Paints a bullseye target.
    @Override
    public void paintComponent(Graphics page) {
        super.paintComponent(page); //To change body of generated methods, choose Tools | Templates.

        int x = 0, y = 0, diameter = MAX_WIDTH;

        page.setColor(Color.white);

        for (int count = 0; count < NUM_RINGS; count++) {

            if (page.getColor() == Color.black) {
                page.setColor(Color.white);
            } else {
                page.setColor(Color.black);
            }

            page.fillOval(x, y, diameter, diameter);

            diameter -= (2 * RING_WIDTH);
            x += RING_WIDTH;
            y += RING_WIDTH;

        }

        // Draw the red bullseye in the center.

        page.setColor(Color.red);
        page.fillOval(x, y, diameter, diameter);

    }
}
