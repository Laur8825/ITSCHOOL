package session3.challenges;

//6. Write a Java program that takes two numbers from the user and uses relational operators to display whether the first number is greater than, less than, or equal to the second number.

import java.util.Scanner;

public class challenge6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the first number
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        // Input the second number
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Compare the numbers using relational operators
        if (num1 > num2) {
            System.out.println(num1 + " is greater than " + num2);
        } else if (num1 < num2) {
            System.out.println(num1 + " is less than " + num2);
        } else {
            System.out.println(num1 + " is equal to " + num2);
        }

        scanner.close();
    }
}