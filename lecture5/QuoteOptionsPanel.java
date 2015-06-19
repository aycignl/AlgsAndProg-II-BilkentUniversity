package lecture5;
/*
 * username: Gonul
 * e-mail: gonul.ayci90@gmail.com
 * from Bilkent University Computer Science Algorithms&ProgrammingII video lectures.
 */

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

class QuoteOptionsPanel extends JPanel {

    private JLabel quote;
    private JRadioButton comedy, philosophy, carpentry;
    private String comedyQuote, philosophyQuote, carpentryQuote;

    public QuoteOptionsPanel() {

        comedyQuote = "Take my wife, please.";
        philosophyQuote = "I think, therefore I am.";
        carpentryQuote = "Measure twice. Cut once.";

        quote = new JLabel(comedyQuote);
        quote.setFont(new Font("Helvetica", Font.BOLD, 24));

        comedy = new JRadioButton("comedy", true);
        comedy.setBackground(Color.green);
        philosophy = new JRadioButton("philosophy");
        philosophy.setBackground(Color.green);
        carpentry = new JRadioButton("carpentry");
        carpentry.setBackground(Color.green);

        ButtonGroup group = new ButtonGroup();
        group.add(comedy);
        group.add(philosophy);
        group.add(carpentry);

        QuoteListener listener = new QuoteListener();
        comedy.addActionListener(listener);
        philosophy.addActionListener(listener);
        carpentry.addActionListener(listener);

        add(quote);
        add(comedy);
        add(philosophy);
        add(carpentry);

        setBackground(Color.green);
        setPreferredSize(new Dimension(300, 100));



    }

    private class QuoteListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            Object sources = e.getSource();

            if (sources == comedy) {
                quote.setText(comedyQuote);
            } else if (sources == philosophy) {
                quote.setText(philosophyQuote);
            } else {
                quote.setText(carpentryQuote);
            }
        }
    }
}
