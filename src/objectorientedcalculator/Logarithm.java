package objectorientedcalculator;

/**
 *
 * @author williamdistler
 */
public class Logarithm {
    
    History history = History.getInstance();
    
    public float logarithm(int x) {
        float result = (float) Math.log(x);
        history.addResult("log(" + x + ") = " + result);
        return result;
    }
    
}
