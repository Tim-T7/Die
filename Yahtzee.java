
/**
 * Write a description of class Yahtzee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Random;
public class Yahtzee
{
    // instance variables - replace the example below with your own
    private Die6 die1;
    private Die6 die2;
    private Die6 die3;
    private Die6 die4;
    private Die6 die5;

    /**
     * Constructor for objects of class Yahtzee
     */
    public Yahtzee()
    {
        // initialise instance variables
        this.die1 = new Die6();
        this.die2 = new Die6();
        this.die3 = new Die6();
        this.die4 = new Die6();
        this.die5 = new Die6();
        roll();
    }

    public void roll() {
        this.die1.roll();
        this.die2.roll();
        this.die3.roll();
        this.die4.roll();
        this.die5.roll();
    }

    public void roll(int dieNumber) {
        if (dieNumber == 1) {
            this.die1.roll();
        }
        if (dieNumber == 2){
            this.die2.roll();
        }
        if (dieNumber == 3) {
            this.die3.roll();
        }
        if (dieNumber == 4) {
            this.die4.roll();
        }
        if (dieNumber == 5) {
            this.die5.roll();
        }
    }

    public String summarize() {
        String Summary = "";
        int[] dice= {this.die1.getValue(),this.die2.getValue(),this.die3.getValue(),this.die4.getValue(),this.die5.getValue()};
        for (int sides = 0; sides < 6; sides++) {
            int count =0;
            for (int value:dice){
                if (value == sides+1) {
                    count++;
                }
            }
            String ending = sides+1 != 6? ";":"";
            Summary += Integer.toString(sides+1) + "-" + Integer.toString(count)+ending;
        }
        return Summary;
    }

    public String toString(){
        String strOfDice = "";
        int[] dice = {this.die1.getValue(),this.die2.getValue(),this.die3.getValue(),this.die4.getValue(),this.die5.getValue()};
        for (int values = 0; values <dice.length; values++) {
            strOfDice += Integer.toString (dice[values]) + " ";
        }
        return "Dice values:" + strOfDice.substring(0,strOfDice.length()-1);
    }
}

