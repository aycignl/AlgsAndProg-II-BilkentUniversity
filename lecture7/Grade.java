package lecture7;
//********************************************************************
// GradeRange.java Author: Lewis/Loftus
//
// Represents a school grade.
//********************************************************************
public class Grade {

    private String name;
    private int lowerBound;

    // Constructor: Sets up Grade object with the specified grade name and numeric lower bound.
    public Grade(String grade, int cutoff) {

        name = grade;
        lowerBound = cutoff;
    }

    // Returns a string representation of this grade.
    public String tostString() {

        return name + "\t" + lowerBound;

    }

    // name mutator
    public void setLowerBound(int cutoff) {

        lowerBound = cutoff;
    }

    // name accessor
    public String getName() {
        return name;
    }
    // lower bound accessor.

    public int getLowerBound() {
        return lowerBound;

    }
}
