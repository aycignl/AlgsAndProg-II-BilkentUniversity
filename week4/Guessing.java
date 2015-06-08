package week4;

/*
 * username: Gonul
 * e-mail: gonul.ayci90@gmail.com
 * from Bilkent University Computer Science Algorithms&ProgrammingII video lectures.
 */
import java.util.Random;
import java.util.Scanner;

public class Guessing {

    public static void main(String[] args) {

        // Plays a simple guessing game with the user.

        final int MAX = 10;
        int answer, guess;

        Scanner scan = new Scanner(System.in);
        Random generator = new Random();

        // Generate a random number between 0 and MAX.
        answer = generator.nextInt(MAX) + 1;

        System.out.println("I am thinking of a number between 1 and " + MAX + ", Guess what it is: ");

        guess = scan.nextInt();

        if (guess == answer) {
            System.out.println("You got it! Good guessing! ");
        } else {
            System.out.println("That is not correct, sorry. ");
            System.out.println("The number was " + answer);
        }


    }
}
