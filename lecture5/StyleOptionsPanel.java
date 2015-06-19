package lecture5;
/*
 * username: Gonul
 * e-mail: gonul.ayci90@gmail.com
 * from Bilkent University Computer Science Algorithms&ProgrammingII video lectures.
 */

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

// Sets up a panel with a label and some check boxes that control
// the style of the label's font.
class StyleOptionsPanel extends JPanel {

    private JLabel saying;
    private JCheckBox bold, italic;

    public StyleOptionsPanel() {

        saying = new JLabel("Say it with style!");
        saying.setFont(new Font("Helvetica", Font.PLAIN, 36));

        bold = new JCheckBox("Bold");
        bold.setBackground(Color.cyan);

        italic = new JCheckBox("Italic");
        italic.setBackground(Color.cyan);

        StyleListener listener = new StyleListener();
        bold.addItemListener(listener);
        italic.addItemListener(listener);
        
        add(saying);
        add(bold);
        add(italic);


        setBackground(Color.cyan);
        setPreferredSize(new Dimension(300, 100));


    }

    // Rpresents the listener for both checkboxes
    private class StyleListener implements ItemListener {

        // Updates the style of the label font style.
        public void itemStateChanged(ItemEvent e) {
            int style = Font.PLAIN;

            if (bold.isSelected()) {
                style = Font.BOLD;
            }
            if (italic.isSelected()) {
                style += Font.ITALIC;
            }

            saying.setFont(new Font("Helvetica", style, 36));

        }
    }
}
