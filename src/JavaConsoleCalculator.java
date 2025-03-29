import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1;
        while (true) {
            System.out.print("Enter the first number: ");
            if (scanner.hasNextDouble()) {
                num1 = scanner.nextDouble();
                break;
            } else {
                System.out.println("Error: Invalid input. Please enter a number.");
                scanner.next();
            }
        }

        String operator;
        while (true) {
            System.out.print("Enter the operator (+, -, *, /): ");
            operator = scanner.next();
            if (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) {
                break;
            } else {
                System.out.println("Error: Invalid operator. Please enter +, -, *, or /.");
            }
        }

        double num2;
        while (true) {
            System.out.print("Enter the second number: ");
            if (scanner.hasNextDouble()) {
                num2 = scanner.nextDouble();
                break;
            } else {
                System.out.println("Error: Invalid input. Please enter a number for the second number.");
                scanner.next();
            }
        }

        double result = 0;

        if (operator.equals("+")) {
            result = num1 + num2;
        } else if (operator.equals("-")) {
            result = num1 - num2;
        } else if (operator.equals("*")) {
            result = num1 * num2;
        } else if (operator.equals("/")) {
            if (num2 != 0) {
                result = num1 / num2;
            } else {
                System.out.println("Error: Division by zero!");
                return;
            }
        } else {
            System.out.println("Error: Invalid operator!");
            return;
        }

        System.out.println("Result: " + num1 + " " + operator + " " + num2 + " = " + result);

        scanner.close();
    }
}
