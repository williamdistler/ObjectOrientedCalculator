package objectorientedcalculator;

/**
 *
 * @author williamdistler
 */
public class OperatorType {

    int operatorType;

    public int getOperatorType(int operator) {
        switch (operator) {
            case 0:
                System.exit(0);
            case 1:
            case 2:
            case 3:
            case 4:
                operatorType = 0;
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                operatorType = 2;
                break;
            case 10:
                operatorType = 1;
                break;
            default:
                operatorType = 3;
                break;
        }
        return operatorType;
    }

}
