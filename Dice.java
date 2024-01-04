
/**
 * Write a description of class Dice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Random;
public class Dice
{
    // instance variables - replace the example below with your own
    private int value;
    private DieN die1;
    private DieN die2;

    /**
     * Constructor for objects of class Dice
     */
    public Dice()
    {
        // initialise instance variables
        this.die1 = new DieN(6);
        this.die2 = new DieN(6);
    }

    public void roll() {
        this.die1.roll();
        this.die2.roll();
    }

    public int getValue() {
        roll();
        return die1.getValue()+die2.getValue();
    }

    public int rollAndGetValue() {
        roll();
        return getValue();
    }
}
