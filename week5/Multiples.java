package week5;
/*
 * username: Gonul
 * e-mail: gonul.ayci90@gmail.com
 * from Bilkent University Computer Science Algorithms&ProgrammingII video lectures.
 */

import java.util.Scanner;

public class Multiples {

    public static void main(String[] args) {

        final int PER_LINE = 2;
        int value, limit, mult, count = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a positive value: ");
        value = scan.nextInt();

        System.out.println("Enter an upper limit: ");
        limit = scan.nextInt();

        System.out.println();
        System.out.println("The multiples of " + value + " between "
                + value + " and " + limit + " (inclusive)are : ");

        for (mult = value; mult <= limit; mult += value) {

            System.out.println(mult + "\t");

            // Print a spesific number of values per line of output
            count++;
            if (count % PER_LINE == 0) {
                System.out.println();
            }

        }
    }
}
