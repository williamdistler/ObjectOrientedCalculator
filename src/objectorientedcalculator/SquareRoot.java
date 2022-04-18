package objectorientedcalculator;

/**
 *
 * @author williamdistler
 */
public class SquareRoot {

    History history = History.getInstance();

    public float doSquareRoot(int x) {
        float result = (float) Math.sqrt(x);
        history.results.add("Raiz quadrada de " + x + " = " + result);
        return result;
    }

}
