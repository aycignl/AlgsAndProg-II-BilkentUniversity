package lecture5;
/*
 * username: Gonul
 * e-mail: gonul.ayci90@gmail.com
 * from Bilkent University Computer Science Algorithms&ProgrammingII video lectures.
 */

//********************************************************************
// EvenOdd.java Author: Lewis/Loftus
//
// Demonstrates the use of the JOptionPane class.
//********************************************************************
import javax.swing.JOptionPane;

// Determines if the value input by the user is even or odd.
// Uses multiple dialog boxes for user interaction.
public class EvenOdd {

    public static void main(String[] args) {

        String numStr, result;
        int num, again;

        do {
            numStr = JOptionPane.showInputDialog("Enter an integer: ");

            num = Integer.parseInt(numStr);

            result = "That number is:" + ((num % 2 == 0) ? "even" : "odd");

            JOptionPane.showMessageDialog(null, result);

            again = JOptionPane.showConfirmDialog(null, "Do another? ");
        } while (again == JOptionPane.YES_OPTION);

    }
}
