package lecture7;

//********************************************************************
// Direction.java Author: Lewis/Loftus
//
// Demonstrates the use of key events.
//********************************************************************
import javax.swing.*;

public class Direction extends JApplet {
//-----------------------------------------------------------------
// Adds the display panel to the applet.
//-----------------------------------------------------------------
    public void init() {
        getContentPane().add(new DirectionPanel(this));
    }
}