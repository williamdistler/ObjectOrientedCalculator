package objectorientedcalculator;

/**
 *
 * @author williamdistler
 */
public class Sum {
    
    History history = new History();
    
    public int add(int x, int y) {
        int result = x + y;
        history.results.add(x + " + " + y + " = " + result);
        return result;
    }
    
}
