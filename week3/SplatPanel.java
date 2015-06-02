package week3;

/*
 * username: Gonul
 * e-mail: gonul.ayci90@gmail.com
 * from Bilkent University Computer Science Algorithms&ProgrammingII video lectures.
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

public class SplatPanel extends JPanel {

    private Circle circle1, circle2, circle3, circle4, circle5;

    public SplatPanel() {

        circle1 = new Circle(30, Color.red, 70, 35);
        circle2 = new Circle(50, Color.green, 30, 20);
        circle3 = new Circle(100, Color.cyan, 60, 85);
        circle4 = new Circle(45, Color.yellow, 170, 30);
        circle5 = new Circle(60, Color.blue, 200, 60);

        setPreferredSize(new Dimension(300, 200));
        setBackground(Color.black);
    }

    public void paintComponent(Graphics page) {

        super.paintComponent(page);

//        circle1.draw(page);
//        circle2.draw(page);
//        circle3.draw(page);
//        circle4.draw(page);
//        circle5.draw(page);

        for (int i = 0; i < 100; i++) {

            circle1.setColor(new Color((int) (Math.random() * 255), (int) (Math.random() * 255), (int) (Math.random() * 255)));
            circle1.setDiameter((int) (Math.random() * 10));
            circle1.setX((int) (Math.random() * 300));
            circle1.setY((int) (Math.random() * 300));
            circle1.draw(page);

        }

    }
}
