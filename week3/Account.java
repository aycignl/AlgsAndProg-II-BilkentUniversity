package week3;
/*
 * username: Gonul
 * e-mail: gonul.ayci90@gmail.com
 * from Bilkent University Computer Science Algorithms&ProgrammingII video lectures.
 */

import java.text.NumberFormat;

public class Account {

    private final double RATE = 0.035; //interest rate of 3.54
    private long acctNumber;
    private double balance;
    private String name;

    public Account(String owner, long account, double initial) {
        name = owner;
        acctNumber = account;
        balance = initial;

    }

    public double deposit(double amount) {
        balance = balance + amount;

        return balance;

    }

    public double withdraw(double amount, double fee) {
        balance = balance - amount - fee;

        return balance;

    }

    public double addInterest() {
        balance += (balance * RATE);

        return balance;

    }

    public double getBalance() {

        return balance;

    }

    public String toString() {
        NumberFormat fmt = NumberFormat.getCurrencyInstance();
        return (acctNumber + "\t" + name + "\t" + fmt.format(balance));
    }
}
