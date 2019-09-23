package basic;

import java.util.Random;

/**
 *
 * @author Humberto
 */
public class Roshambu 
{
 private int chances;
 private Random random;
 
    public Roshambu(int alotchances)
    {
        chances = alotchances;
        random = new Random();
    }

    public int rolls()
    {
        return random.nextInt(chances);
    }

}
