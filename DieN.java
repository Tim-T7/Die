
/**
 * Write a description of class DieN here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DieN
{
    // instance variables - replace the example below with your own
    private int value;
    private int n;
    /**
     * Constructor for objects of class DieN
     */
    public DieN(int sides) {
        this.roll();
        this.n=sides;
    }

    public int getValue() {
        return value;
    }

    public void roll() {
        this.value = (int)(Math.random() * n) +1;
    }

    public int rollAndGetValue() {
        roll();
        return getValue();
    }
}
