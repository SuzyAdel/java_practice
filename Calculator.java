/*
Suzy's Calculator, 211004476 classthursday 6:30 
 */
package calculator;

/**
 *
 * @author Suzy
 */
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalculator = true;

        // Loop for calculator
        while (continueCalculator) {
            System.out.println("Enhanced Calculator");
            System.out.println("Choose an operation:");
            System.out.println("1. Addition (+)");
            System.out.println("2. Subtraction (-)");
            System.out.println("3. Multiplication (*)");
            System.out.println("4. Division (/)");
            System.out.println("5. Square Root (√)");
            System.out.println("6. Square (x^2)");
            System.out.println("7. Cube (x^3)");

            System.out.print("Enter your choice (1-7): ");
            int choice = scanner.nextInt();

            double num1 = 0;
            double num2 = 0;
            double result = 0;

            // Input numbers based on the chosen operation
            if (choice >= 1 && choice <= 4) {
                System.out.print("Enter the first number: ");
                num1 = scanner.nextDouble();

                System.out.print("Enter the second number: ");
                num2 = scanner.nextDouble();
            } else if (choice >= 5 && choice <= 7) {
                System.out.print("Enter the number: ");
                num1 = scanner.nextDouble();
            } else {
                System.out.println("Invalid choice. Please choose a number between 1 and 7.");
                continue; // Loop back to the beginning to allow the user to try again
            }

            // Perform the chosen operation
            if (choice == 1) {
                result = num1 + num2;
            } else if (choice == 2) {
                result = num1 - num2;
            } else if (choice == 3) {
                result = num1 * num2;
            } else if (choice == 4) {
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Can't divide by zero!");
                }
            } else if (choice == 5) {
                if (num1 >= 0) {
                    result = Math.sqrt(num1);
                } else {
                    System.out.println("Cannot calculate square root of a negative number!");
                }
            } else if (choice == 6) {
                result = Math.pow(num1, 2);
            } else if (choice == 7) {
                result = Math.pow(num1, 3);
            } else {
                System.out.println("Please choose a number between 1 and 7.");
            }

            // Display the result
            System.out.println("Result: " + result);

            // Check if the user wants to calculate again
            System.out.print("Do you want to calculate again? (Y/N): ");
            String repeatChoice = scanner.next().toUpperCase();

            if (!repeatChoice.equals("Y")) {
                continueCalculator = false;
            }
        }

        System.out.println("Thank you! byeeeeeee");
    }
}
