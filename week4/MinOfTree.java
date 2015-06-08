package week4;

/*
 * username: Gonul
 * e-mail: gonul.ayci90@gmail.com
 * from Bilkent University Computer Science Algorithms&ProgrammingII video lectures.
 */
import java.util.Scanner;

public class MinOfTree {

    public static void main(String[] args) {

        int num1, num2, num3, min = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter three integers: ");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        num3 = scan.nextInt();

        if (num1 < num2) {
            if (num1 < num3) {
                min = num1;
            } else {
                min = num3;
            }
        } else if (num2 < num3) {
            min = num2;
        } else {
            min = num3;
        }
        System.out.println("Minimum value= " + min);



    }
}
