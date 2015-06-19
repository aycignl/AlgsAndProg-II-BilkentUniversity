package lecture5;
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

class LeftRightPanel extends JPanel {

    private JButton left, right;
    private JLabel label;
    private JPanel buttonPanel;
    
    public LeftRightPanel() {
        
        left = new JButton("Left");
        right = new JButton("Right");
        
        ButtonListener listener = new ButtonListener();
        left.addActionListener(listener);
        right.addActionListener(listener);
        
        label = new JLabel("Push a button");
        
        buttonPanel = new JPanel();
        buttonPanel.setPreferredSize(new Dimension(200, 40));
        buttonPanel.setBackground(Color.blue);
        buttonPanel.add(left);
        buttonPanel.add(right);
        
        setPreferredSize(new Dimension(200, 80));
        setBackground(Color.cyan);
        add(label);
        add(buttonPanel);
        
    }

    // Represents a listener for both buttons.
    private class ButtonListener implements ActionListener {
        
        public void actionPerformed(ActionEvent e) {
            
            if (e.getSource() == left) 
                label.setText("Left");
             else 
                label.setText("Right");
            
        }
    }
}

