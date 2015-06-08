package week4;

/*
 * username: Gonul
 * e-mail: gonul.ayci90@gmail.com
 * from Bilkent University Computer Science Algorithms&ProgrammingII video lectures.
 */
import java.util.Scanner;

public class Age {

    public static void main(String[] args) {

        final int MINOR = 21;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age: ");

        int age = scan.nextInt();
        System.out.println("You entered: " + age);

        if (age < MINOR) {
            System.out.println("Youth is a wonderful thing. Enjoy.");
        }
        System.out.println("Age is a state of mind.");

    }
}
