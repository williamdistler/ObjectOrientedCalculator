/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objectorientedcalculator;

import java.util.Scanner;

/**
 *
 * @author info
 */
public class Operation {

    public int getOperation() {
        Scanner scanner = new Scanner(System.in);
        int operation = scanner.nextInt();

        if (operation == 0) {
            System.exit(0);
        }
        
        return operation;
    }

}
