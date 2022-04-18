package objectorientedcalculator;

/**
 *
 * @author williamdistler
 */
public class Multiplication {

    History history = History.getInstance();

    public int multiply(int x, int y) {
        int result = x * y;
        history.addResult(x + " x " + y + " = " + result);
        return result;
    }

}
