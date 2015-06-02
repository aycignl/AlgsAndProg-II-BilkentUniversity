package week3;

/*
 * username: Gonul
 * e-mail: gonul.ayci90@gmail.com
 * from Bilkent University Computer Science Algorithms&ProgrammingII video lectures.
 */
public class Transactions {

    public static void main(String[] args) {

        Account acct1 = new Account("Ted Murphy", 72354, 102.56);
        Account acct2 = new Account("Jane Smith", 69713, 40.00);
        Account acct3 = new Account("Edward Demsey", 93757, 759.32);

        acct1.deposit(25.85);

        double smithBalance = acct2.deposit(500.00);
        System.out.println("Smith balance after deposit: " + smithBalance);

        System.out.println("Smith balance after withdrawal: " + acct2.withdraw(430.75, 1.50));

        acct1.addInterest();
        acct2.addInterest();
        acct3.addInterest();

        // it goes to toString() method
        System.out.println();
        System.out.println(acct1);
        System.out.println(acct2);
        System.out.println(acct3);
    }
}
