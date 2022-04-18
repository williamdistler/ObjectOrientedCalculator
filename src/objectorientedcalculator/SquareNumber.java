package objectorientedcalculator;

/**
 *
 * @author williamdistler
 */
public class SquareNumber {
    
    History history = new History();
    
    public int squareNumber(int x) {
        int result = x * x;
        history.results.add(x + "^2 = " + result);
        return result;
    }
    
}
