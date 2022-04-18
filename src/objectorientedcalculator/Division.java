package objectorientedcalculator;

/**
 *
 * @author williamdistler
 */
public class Division {

    History history = History.getInstance();

    public float divide(int x, int y) {
        float result = (float) x / y;
        History.results.add(x + " / " + y + " = " + result);
        return result;
    }

}
