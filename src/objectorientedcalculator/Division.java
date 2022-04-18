package objectorientedcalculator;

/**
 *
 * @author williamdistler
 */
public class Division {
    
    History history = new History();
    
    public float divide(int x, int y) {
        float result = (float) x / y;
        history.results.add(x + " / " + y + " = " + result);
        return result;
    }
    
}
