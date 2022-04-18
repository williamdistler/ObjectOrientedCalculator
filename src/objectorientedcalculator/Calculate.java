package objectorientedcalculator;

import java.util.List;

/**
 *
 * @author williamdistler
 */
public class Calculate {
    Sum sum = new Sum();
    Subtraction subtraction = new Subtraction();
    Multiplication multiplication = new Multiplication();
    Division division = new Division();
    SquareNumber squareNumber = new SquareNumber();
    CubeNumber cubeNumber = new CubeNumber();
    SquareRoot squareRoot = new SquareRoot();
    RootCubic rootCubic = new RootCubic();
    Logarithm logarithm = new Logarithm();
    
    float result;
    
    public float getResultOneNumber(int operation, int num) {
        switch (operation) {
            case 5:
                result = squareNumber.squareNumber(num);
                break;
            case 6:
                result = cubeNumber.cubeNumber(num);
                break;
            case 7:
                result = squareRoot.doSquareRoot(num);
                break;
            case 8:
                result = rootCubic.makeCubeRoot(num);
                break;
            case 9:
                result = logarithm.logarithm(num);
                break;
        }
        return result;
    }
    
    public float getResultTwoNumbers(int operation, int n1, int n2) {
        
        switch (operation) {
            case 1:
                result = sum.add(n1, n2);
                break;
            case 2:
                result = subtraction.subtract(n1, n2);
                break;
            case 3:
                result = multiplication.multiply(n1, n2);
                break;
            case 4:
                result = division.divide(n1, n2);
                break;
        }
        
        return result;
    }
    
}
