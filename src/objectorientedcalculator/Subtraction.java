package objectorientedcalculator;

/**
 *
 * @author williamdistler
 */
public class Subtraction {
    
    History history = new History();
    
    public int subtract(int x, int y) {
        int result = x - y;
        history.results.add(x + " - " + y + " = " + result);
        return result;
    }
    
}
