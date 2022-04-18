package objectorientedcalculator;

/**
 *
 * @author williamdistler
 */
public class Multiplication {

    History history = History.getInstance();

    public int multiply(int x, int y) {
        int result = x * y;
        history.results.add(x + " x " + y + " = " + result);
        return result;
    }

}
