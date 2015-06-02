package week3;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * username: Gonul
 * e-mail: gonul.ayci90@gmail.com
 * from Bilkent University Computer Science Algorithms&ProgrammingII video lectures.
 */
class FahrenheitPanel extends JPanel{
    
    private JLabel inputLabel, outputLabel, resultLabel;
    private JTextField fahrenheit;
    
    // Constructor: Sets up the main GUI components.
    
    public FahrenheitPanel(){
        
        inputLabel = new JLabel("Enter Fahrenheit temperature: ");
        outputLabel = new JLabel("Temperature in Celcius: ");
        resultLabel = new JLabel("---");
        
        fahrenheit = new JTextField(5);
        fahrenheit.addActionListener(new TempListener());
        
        add(inputLabel);
        add(fahrenheit);
        add(outputLabel);
        add(resultLabel);
        
        
                
        setPreferredSize(new Dimension(300, 75));
        setBackground(Color.yellow);
    }

    private class TempListener implements ActionListener {

        //Performs the conversion when the enter key is pressed in the text field.
        
        public void actionPerformed(ActionEvent e) {
            
            int fahrenheitTemp, celsiusTemp;
            String text = fahrenheit.getText();
            
            fahrenheitTemp = Integer.parseInt(text);
            celsiusTemp = (fahrenheitTemp-32) *5/9;
            
            resultLabel.setText(Integer.toString(celsiusTemp));
        }
    }
    
}
