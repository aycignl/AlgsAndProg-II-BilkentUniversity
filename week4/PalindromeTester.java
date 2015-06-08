package week4;

import java.util.Scanner;
/*
 * username: Gonul
 * e-mail: gonul.ayci90@gmail.com
 * from Bilkent University Computer Science Algorithms&ProgrammingII video lectures.
 */

public class PalindromeTester {

    public static void main(String[] args) {

        String str, another = "y";
        int left, right;

        Scanner scan = new Scanner(System.in);

        while (another.equalsIgnoreCase("y")) // allows y or Y.
        {
            System.out.println("Enter a potential palindrome: ");
            str = scan.nextLine();

            left = 0;
            right = str.length() - 1;

            while (str.charAt(left) == str.charAt(right) && left < right) {

                left++;
                right--;
            }
            System.out.println();

            if (left < right) {
                System.out.println("That string is NOT a palindrome");
            } else {
                System.out.println("That string is a palindrome");
            }

            System.out.println();
            System.out.println("Test another palindrome (y/n)? ");
            another = scan.nextLine();
        }

    }
}
