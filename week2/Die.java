package week2;

/*
 * username: Gonul
 * e-mail: gonul.ayci90@gmail.com
 * from Bilkent University Computer Science Algorithms&ProgrammingII video lectures.
 */

public class Die {
    
    private final int MAX = 6; // maximum face value
    
    private int faceValue; // current valur showing on the die
    
    public Die(){
        faceValue = 1;
       
    }
    
    //rolls the die and returns the result.
    public int roll(){
        faceValue = (int) (Math.random() * MAX + 1);
        return faceValue;
    }
    
    // face value autator.
    public void setFaceValue(int Value){
        faceValue = Value;
    }
    
    //face value accessor
    public int getFaceValue(){
        return faceValue;
        
    }
    
    //returns a string representation of this die.
    public String tostString(){
        String result = Integer.toString(faceValue);
        
        return result;
        
        
        
    }
    
}
