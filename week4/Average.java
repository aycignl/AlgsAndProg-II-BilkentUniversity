package week4;

import java.util.Scanner;

/*
 * username: Gonul
 * e-mail: gonul.ayci90@gmail.com
 * from Bilkent University Computer Science Algorithms&ProgrammingII video lectures.
 */
public class Average {

    // Computes the average of a set of values entered by the user.
    // The running sum is printed as the numbers are entered.
    public static void main(String[] args) {

        int sum = 0, value, count = 0;
        double average;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter an integer (0 to quit): ");
        value = scan.nextInt();

        while (value != 0) // Sentinel value of 0 to terminate loop{
        {
            count++;
        }

        sum += value;
        System.out.println("The sum so far is " + sum);

        System.out.println("Enter an integer (0 to quit): ");
        value = scan.nextInt();

    }
}
