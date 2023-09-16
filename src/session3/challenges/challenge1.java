package session3.challenges;

import java.util.Scanner;


//1. Write a Java program to take two numbers as input and display the result of addition, subtraction, multiplication, division, and modulus.
public class challenge1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // Input the second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Perform calculations
        double addition = num1 + num2;
        double substraction = num1 - num2;
        double multiplication = num1 * num2;
        double division = num1 / num2;
        double modulus = num1 % num2;

        // Display results
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + substraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
        System.out.println("Modulus: " + modulus);

        scanner.close();
    }
}


