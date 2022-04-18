package objectorientedcalculator;

/**
 *
 * @author williamdistler
 */
public class Subtraction {

    History history = History.getInstance();

    public int subtract(int x, int y) {
        int result = x - y;
        history.addResult(x + " - " + y + " = " + result);
        return result;
    }

}
