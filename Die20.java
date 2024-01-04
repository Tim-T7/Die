
/**
 * Write a description of class Die20 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Die20
{
    // instance variables - replace the example below with your own
    private int value;

    /**
     * Constructor for objects of class Die20
     */
    public Die20()
    {
        this.roll();
    }

    public int getValue() {
        return value;
    }

    public void roll() {
        this.value = (int) (Math.random() * 6) +1;
    }

    public int rollAndGetValue() {
        roll();
        return getValue();
    }

}
