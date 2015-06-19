package lecture5;
/*
 * username: Gonul
 * e-mail: gonul.ayci90@gmail.com
 * from Bilkent University Computer Science Algorithms&ProgrammingII video lectures.
 */

//********************************************************************
// Stars.java Author: Lewis/Loftus
//
// Demonstrates the use of nested for loops.
//********************************************************************

public class Stars {

    // Prints a triangle shape using star characters.
    public static void main(String[] args) {

        final int MAX_ROWS = 10;

        for (int row = 1; row <= MAX_ROWS; row++) {

            for (int star = 1; star <= MAX_ROWS - row; star++) {
                System.out.println(" ");
            }
            for (int star = 1; star <= 2 * row - 1; star++) {
                System.out.println("*");
            }
        }
        System.out.println();

    }
}
