package objectorientedcalculator;

/**
 *
 * @author williamdistler
 */
public class CubeNumber {
    
    History history = new History();
    
    public int cubeNumber(int x) {
        int result = x * x * x;
        history.addResult(x + "^3 = " + result);
        return result;
    }
    
}
