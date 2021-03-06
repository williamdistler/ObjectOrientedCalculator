package objectorientedcalculator;

/**
 *
 * @author williamdistler
 */
public class RootCubic {

    History history = History.getInstance();

    public float makeCubeRoot(int x) {
        float result = (float) Math.cbrt(x);
        history.addResult("Raiz cubica de " + x + " = " + result);
        return result;
    }

}
