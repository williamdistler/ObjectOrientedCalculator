package objectorientedcalculator;

/**
 *
 * @author williamdistler
 */
public class RootCubic {
    
    public String makeCubeRoot(int x) {
        float result = (float) Math.cbrt(x);
        return "Raiz cubica de " + x + " = " + result;
        
    }
    
}
