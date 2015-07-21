package lecture7;
//********************************************************************
// GradeRange.java Author: Lewis/Loftus
//
// Demonstrates the use of an array of String objects.
//********************************************************************
public class GradeRange {
//-----------------------------------------------------------------
// Stores the possible grades and their numeric lowest value,
// then prints them out.
//-----------------------------------------------------------------

    public static void main(String[] args) {
        String[] grades = {"A", "A-", "B+", "B", "B-", "C+", "C", "C-",
            "D+", "D", "D-", "F"};
        int[] cutoff = {95, 90, 87, 83, 80, 77, 73, 70, 67, 63, 60, 0};
        for (int level = 0; level < cutoff.length; level++) {
            System.out.println(grades[level] + "\t" + cutoff[level]);
        }

//       Creates an array of Grade objects and prints them.
//        Grade[] gradess = {
//            new Grade("A", 95), new Grade("A-", 90),
//            new Grade("B+", 87), new Grade("B", 85), new Grade("B-", 80),
//            new Grade("C+", 77), new Grade("C", 75), new Grade("C-", 70),
//            new Grade("D+", 67), new Grade("D", 65), new Grade("D-", 60),
//            new Grade("F", 0)
//        };
//        
//        for(Grade letterGrade : gradess)
//            System.out.println(letterGrade);
    }
}