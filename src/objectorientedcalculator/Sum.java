package objectorientedcalculator;

/**
 *
 * @author williamdistler
 */
public class Sum {

    History history = History.getInstance();

    public int add(int x, int y) {
        int result = x + y;
        history.addResult(x + " + " + y + " = " + result);
        return result;
    }

}
