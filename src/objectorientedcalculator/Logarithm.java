package objectorientedcalculator;

/**
 *
 * @author williamdistler
 */
public class Logarithm {
    
    History history = new History();
    
    public float logarithm(int x) {
        float result = (float) Math.log(x);
        history.results.add("log(" + x + ") = " + result);
        return result;
    }
    
}
