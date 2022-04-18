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
        float lastOperation = 0.0f;

        Guide guide = new Guide();
        OperatorType operatorType = new OperatorType();
        Operation getOperation = new Operation();
        Calculate calculate = new Calculate();
        History history = History.getInstance();
        float result = 0.0f;

        guide.getGuide();
        int operator = 1;

        while (operator != 0) {
            operator = getOperation.getOperation();

            int operatorTypeVar = operatorType.getOperatorType(operator);

            if (operatorTypeVar == 0) {
                System.out.println("Utilizar resultado da ultima operacao?");
                System.out.println("0 - SIM");
                System.out.println("1 - NAO");
                int ifLastOperation = scanner.nextInt();
                if (ifLastOperation == 0) {
                    n1 = (int) lastOperation;
                    System.out.println("Digite o proximo numero: ");
                } else {
                    System.out.println("Digite dois numeros para fazer a operação: ");
                    n1 = scanner.nextInt();
                }
                n2 = scanner.nextInt();
                result = calculate.getResultTwoNumbers(operator, n1, n2);
                lastOperation = result;
                System.out.println("Resultado: " + result);
                System.out.println("-------------------------------------------");
            } else if (operatorTypeVar == 1) {
                System.out.println(history.getHistory());
            } else {
                System.out.println("Utilizar resultado da ultima operacao?");
                System.out.println("0 - SIM");
                System.out.println("1 - NAO");
                int ifLastOperation = scanner.nextInt();
                if (ifLastOperation == 0) {
                    n1 = (int) lastOperation;
                } else {
                    System.out.println("Digite o numero que deseja calcular:");
                    n1 = scanner.nextInt();
                }
                result = calculate.getResultOneNumber(operator, n1);
                lastOperation = result;
                System.out.println("Resultado: " + result);
                System.out.println("-------------------------------------------");
            }

            guide.getGuide();

        }
    }

}
