package practice.project.calculator;

import java.util.Scanner;

public class App {

    public static void main( String[] args ) {
        Scanner input = new Scanner(System.in);
        Calculator calculator = new Calculator();

        boolean shouldContinue = true;
        do {
            try {
                System.out.print("Enter an operation: ");
                String operationName = input.next();

                System.out.print("Enter the first number: ");
                int num1 = input.nextInt();

                System.out.print("Enter the second number: ");
                int num2 = input.nextInt();

                switch (operationName) {
                    case "add":
                        System.out.println(calculator.add(num1, num2));
                        return;
                    case "subtract":
                        System.out.println(calculator.subtract(num1, num2));
                        return;
                    case "multiply":
                        System.out.println(calculator.multiply(num1, num2));
                        return;
                    case "divide":
                        System.out.println(calculator.divide(num1, num2));
                        return;
                    default:
                        System.out.println("Unknown operation!");
                }
            } catch (ArithmeticException arithmeticException) {     // catching unchecked exceptions is not best practice. I could just simply validate before using
                System.out.println(arithmeticException.getMessage());
            }
        } while (shouldContinue);

    }

}
