package objectorientedcalculator;

/**
 *
 * @author williamdistler
 */
public class RootCubic {
    
    History history = new History();
    
    public float makeCubeRoot(int x) {
        float result = (float) Math.cbrt(x);
        history.results.add("Raiz cubica de " + x + " = " + result);
        return result;
    }
    
}
