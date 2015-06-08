package week4;
/*
 * username: Gonul
 * e-mail: gonul.ayci90@gmail.com
 * from Bilkent University Computer Science Algorithms&ProgrammingII video lectures.
 */

public class CoinFlip {

    public static void main(String[] args) {
        Coin myCoin = new Coin();

        myCoin.flip();
        System.out.println(myCoin);

        if (myCoin.isHeads()) {
            System.out.println("You win. ");
        } else {
            System.out.println("Better luck next times. ");
        }


    }
}
