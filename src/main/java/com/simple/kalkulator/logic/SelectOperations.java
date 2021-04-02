package com.simple.kalkulator.logic;

import java.util.Scanner;

public class SelectOperations {
    private static Scanner scanner;
    private static int number;

    public SelectOperations() {
        scanner = new Scanner(System.in);
        System.out.println("1.Sum: ,2.Sub: ,3.Multiply: ,4.Divide: ");
        number = scanner.nextInt();

        switch (number) {
            case 1:
                MathematicOperations.doSum();
                break;
            case 2:
                MathematicOperations.doSub();
                break;
            case 3:
                MathematicOperations.doMultiply();
                break;
            case 4:
                MathematicOperations.doDivide();
                break;
            default:
                System.out.println("invalid operation");
                break;
        }
        scanner.close();
    }
}
