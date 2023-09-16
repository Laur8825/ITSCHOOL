package session3.challenges;

//10. Write a program that reverses the sign of an entered integer using unary minus operator.
import java.util.Scanner;

public class challenge10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Reverse the sign using the unary minus operator
        int reversedNumber = -number;

        // Display the result
        System.out.println("Original number: " + number);
        System.out.println("Number with reversed sign: " + reversedNumber);

        scanner.close();
    }
}