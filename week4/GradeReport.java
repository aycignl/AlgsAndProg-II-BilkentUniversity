package week4;

/*
 * username: Gonul
 * e-mail: gonul.ayci90@gmail.com
 * from Bilkent University Computer Science Algorithms&ProgrammingII video lectures.
 */
import java.util.Scanner;

public class GradeReport {

    public static void main(String[] args) {
        int grade, category;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a numeric grade (0 to 100) : ");
        grade = scan.nextInt();

        category = grade / 10;

        System.out.println("That grade is ");

        switch (category) {
            case 10:
                System.out.println("a perfect score. Well done. ");
                break;
            case 9:
                System.out.println("well above average. Excellent. ");
                break;
            case 8:
                System.out.println("above average. Nice job. ");
                break;
            case 7:
                System.out.println("average.");
                break;
            case 6:
                System.out.println("below average. You should see the ");
                System.out.println("instructor to clarify the material" + "presented in class. ");
                break;

            default:
                System.out.println("not passing.");



        }

    }
}
