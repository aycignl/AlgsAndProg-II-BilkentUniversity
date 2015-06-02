package week3;

/*
 * username: Gonul
 * e-mail: gonul.ayci90@gmail.com
 * from Bilkent University Computer Science Algorithms&ProgrammingII video lectures.
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicOptionPaneUI;

class PushCounterPanel extends JPanel {

    private int count;
    private JButton push;
    private JLabel label;

    public PushCounterPanel() {

        count = 0;

        push = new JButton("Push me!");
        push.addActionListener(new ButtonListener());

        label = new JLabel("Pushes: " + count);

        add(push);
        add(label);

        setPreferredSize(new Dimension(300, 40));
        setBackground(Color.cyan);
    }

    // Represents a listener for button push (action) events.
    private class ButtonListener implements ActionListener {

        // Updates the counter and label when the button is pushed.
        public void actionPerformed(ActionEvent e) {

            count++;
            label.setText("Pushes: " + count);
        }
    }
}
