
/**
 * Abstracts one six-sided die (plural is dice)
 * 
 * @Mr. Jaffe
 * @1.0 2017-07-13
 */
public class Dice
{
    Dice die1;
    Dice die2;
    Dice die3;
    Dice die4;
    Dice die5;

    /**
     * Contains the current value of the die
     */
    private int value;

    /**
     * Constructor to do an initial roll to set the first value
     */
    public Dice() 
    {
        die1 = new Dice();
        die2 = new Dice();
        die3 = new Dice();
        die4 = new Dice();
        die5 = new Dice();
    }

    /**
     * Getter for value
     * @return Die value
     */
    public void roll() 
    {
        die1.roll();
        die2.roll();
        die3.roll();
        die4.roll();
        die5.roll();  
    }

    /**
     * Roll the die! Generate random number 1 <= x <= 6 and assign to value
     * Note that roll does NOT return the new value
     */
    public void roll(int dieNumber)
    {
        if (dieNumber == 1) {
            die1.roll();
        } else if (dieNumber ==2) {
            die2.roll();
        } else if (dieNumber ==3) {
            die3.roll();
        } else if (dieNumber ==4) {
            die4.roll();
        } else if (dieNumber ==5) {
            die5.roll();
        }
    }
    
    /**
     * Roll the die and return the new value
     * @return Die value
     */

}

