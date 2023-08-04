package main.java;

import java.util.*;

/**
 * Module 3 Tasks 1-3
 */

public class MoonComputerTests {
    public void testBasicInputOutput() {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println(line);
        scanner.close();
    }

    public void testMath() {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        int dif = num1 - num2;
        int multpl = num1 * num2;
        int div = num1 / num2;
        System.out.println(sum + " " + dif + " " + multpl + " " + div);
        scanner.close();
    }
    public void testLogicalOperators() {
        Scanner scanner = new Scanner(System.in);
        boolean booleanOne = scanner.nextBoolean();
        boolean booleanTwo = scanner.nextBoolean();
        boolean booleanThree = scanner.nextBoolean();

        boolean logicAnd = booleanOne && booleanTwo;
        boolean logicOr = logicAnd || booleanThree;

        System.out.println("logicAnd = " + logicAnd + " " + logicOr);
        scanner.close();
    }

    //Test output on Hello Java standard input
    public static void main(String[] args) {
        //MoonComputerTests computerTests = new MoonComputerTests();
        //computerTests.testBasicInputOutput();

        new MoonComputerTests().testMath();

    }
}