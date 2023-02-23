//Francisco Rodriguez (frodriguez127@toromail.csudh.edu)

import java.util.Random;

public class Dice {
    private int value;

    public Dice() {
        this.value = 0;
    }

    public void cast() {
        Random rand = new Random();
        this.value = rand.nextInt(6) + 1; // generates a random integer between 1 and 6
    }

    @Override
    public String toString() {
        return "The value is: " + this.value;
    }
}
