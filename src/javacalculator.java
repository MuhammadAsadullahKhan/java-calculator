import java.util.Scanner;

public class javacalculator{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking operation choice as input
        System.out.print("Enter operation (add, subtract, multiply, divide, modulus, exponentiation): ");
        String operation = scanner.nextLine().toLowerCase();

        // Taking two numbers as input
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        // Performing selected arithmetic operation
        switch (operation) {
            case "add":
                System.out.println("Addition: " + (num1 + num2));
                break;
            case "subtract":
                System.out.println("Subtraction: " + (num1 - num2));
                break;
            case "multiply":
                System.out.println("Multiplication: " + (num1 * num2));
                break;
            case "divide":
                if (num2 != 0) {
                    System.out.println("Division: " + (num1 / num2));
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;
            case "modulus":
                if (num2 != 0) {
                    System.out.println("Modulus: " + (num1 % num2));
                } else {
                    System.out.println("Modulus by zero is not allowed.");
                }
                break;
            case "exponentiation":
                System.out.println("Exponentiation: " + Math.pow(num1, num2));
                break;
            default:
                System.out.println("Invalid operation.");
        }

        scanner.close();
    }
}
