import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Select an operation:");
        System.out.println("Press 1 for addition");
        System.out.println("Press 2 for subtraction");
        System.out.println("Press 3 for multiplication");
        System.out.println("Press 4 for division");
        System.out.println("Press 5 to square a number");
        System.out.println("Press 6 to find a square root");
        System.out.println("Press 7 to find the reciprocal");

        // Input choice
        int choice = scanner.nextInt();

        // Process based on choice
        if (choice >= 1 && choice <= 4) {
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();
            double result = 0;

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
                    System.out.println("Error: Division by zero");
                    scanner.close();
                    return;
                }
            }

            System.out.println("The product of the numbers " + num1 + " and " + num2 + " is = " + result);

        } else if (choice == 5) {
            System.out.print("Enter the number to find Square: ");
            double num = scanner.nextDouble();
            double result = num * num;
            System.out.println("The Square of the number " + num + " is = " + result);

        } else if (choice == 6) {
            System.out.print("Enter the number for square root: ");
            double num = scanner.nextDouble();
            if (num >= 0) {
                double result = Math.sqrt(num);
                System.out.println("The result is: " + result);
            } else {
                System.out.println("Error: Cannot find square root of a negative number");
            }

        } else if (choice == 7) {
            System.out.print("Enter the number to find Reciprocal: ");
            double num = scanner.nextDouble();
            if (num != 0) {
                double result = 1 / num;
                System.out.println("The Reciprocal of the number " + num +  "is = " + result);
            } else {
                System.out.println("Error: Cannot find reciprocal of zero");
            }

        } else {
            System.out.println("Invalid choice! Please make a valid choice.");
        }

        scanner.close();
    }
}
