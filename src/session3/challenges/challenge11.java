package session3.challenges;


//11. Write a Java program that takes two boolean inputs from a user. Apply the logical negation operator (!) to each and print the result.
import java.util.Scanner;

public class challenge11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the first boolean value
        System.out.print("Enter the first boolean value (true or false): ");
        boolean bool1 = scanner.nextBoolean();

        // Input the second boolean value
        System.out.print("Enter the second boolean value (true or false): ");
        boolean bool2 = scanner.nextBoolean();

        // Apply logical negation operator (!) to each boolean and print the results
        boolean result1 = !bool1;
        boolean result2 = !bool2;

        System.out.println("Negation of the first boolean: " + result1);
        System.out.println("Negation of the second boolean: " + result2);

        scanner.close();
    }
}