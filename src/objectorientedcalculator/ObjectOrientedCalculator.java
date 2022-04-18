package objectorientedcalculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author williamdistler
 */
public class ObjectOrientedCalculator {

    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scanner = new Scanner(System.in);
        int n1, n2;

        Guide guide = new Guide();
        OperatorType operatorType = new OperatorType();
        Operation getOperation = new Operation();
        Calculate calculate = new Calculate();
        History history = new History();
        String result = "2";

        guide.getGuide();
        int operator = 1;

        while (operator != 0) {
            operator = getOperation.getOperation();

            int operatorTypeVar = operatorType.getOperatorType(operator);

            if (operatorTypeVar == 0) {
                System.out.println("Digite dois numeros para fazer a operação: ");
                n1 = scanner.nextInt();
                n2 = scanner.nextInt();
                result = calculate.getResultTwoNumbers(operator, n1, n2);
                history.results.add(result);
                System.out.println("Resultado: " + result);
                System.out.println("-------------------------------------------");
            } else if (operatorTypeVar == 1) {
                System.out.println(history.getHistory());
            } else {
                System.out.println("Digite o numero que deseja calcular:");
                n1 = scanner.nextInt();
                result = calculate.getResultOneNumber(operator, n1);
                System.out.println("Resultado: " + result);
                System.out.println("-------------------------------------------");
            }

            guide.getGuide();

        }
    }

}
