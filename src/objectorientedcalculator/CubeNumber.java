package objectorientedcalculator;

/**
 *
 * @author williamdistler
 */
public class CubeNumber {
    
    History history = History.getInstance();
    
    public int cubeNumber(int x) {
        int result = x * x * x;
        history.addResult(x + "^3 = " + result);
        return result;
    }
    
}
