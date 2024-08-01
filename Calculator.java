import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("Welcome to the Basic Calculator!");

        while (true) {
            System.out.print("Enter first number: ");
            double num1 = s1.nextDouble();

            System.out.print("Enter an operator (+, -, *, /): ");
            char operator = s1.next().charAt(0);

            System.out.print("Enter second number: ");
            double num2 = s1.nextDouble();

            double result = 0;
            boolean validOperation = true;

            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error! Division by zero.");
                        validOperation = false;
                    }
                    break;
                default:
                    System.out.println("Invalid operator. Please use +, -, *, or /.");
                    validOperation = false;
            }

            if (validOperation) {
                System.out.println("The result is: " + result);
            }

            System.out.print("Do you want to perform another calculation? (yes/no): ");
            String continueCalculation = s1.next();

            if (!continueCalculation.equalsIgnoreCase("yes")) {
                break;
            }
        }

        s1.close();
        System.out.println("Thank you for using the Basic Calculator!");
    }
}
