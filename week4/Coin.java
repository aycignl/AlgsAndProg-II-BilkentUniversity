package week4;
/*
 * username: Gonul
 * e-mail: gonul.ayci90@gmail.com
 * from Bilkent University Computer Science Algorithms&ProgrammingII video lectures.
 */

class Coin {

    private final int HEADS = 0;
    private final int TAILS = 1;
    private int face;

    //Set up the coin by flipping it initially.
    public Coin() {

        flip();

    }

    public void flip() {

        face = (int) (Math.random() * 2);
    }

    public boolean isHeads() {
        return face == HEADS;

    }

    public String toString() {

        String faceName;

        if (face == HEADS) {
            faceName = "Heads";
        } else {
            faceName = "Tails";
        }


        return faceName;

    }
}
