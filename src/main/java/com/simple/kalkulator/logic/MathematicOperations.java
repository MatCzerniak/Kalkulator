package com.simple.kalkulator.logic;
import java.util.Scanner;

public class MathematicOperations {
    private static Scanner scanner;

    public static void doSum() {
        scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int x = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int y = scanner.nextInt();
        int result = x + y;
        System.out.println(result);
        scanner.close();
    }

    public static void doSub() {
        scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int x = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int y = scanner.nextInt();
        int result = x - y;
        System.out.println(result);
        scanner.close();
    }

    public static void doMultiply() {
        scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int x = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int y = scanner.nextInt();
        int result = x * y;
        System.out.println(result);
        scanner.close();
    }

    public static void doDivide() {
        scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int x = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int y = scanner.nextInt();
        int result = x / y;
        System.out.println(result);
        scanner.close();
    }

}
