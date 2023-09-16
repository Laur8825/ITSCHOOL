package session3.challenges;
import java.util.Scanner;

//3. Write a program to check if a number is positive or negative using logical complement operator.
public class challenge3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        // Check if the number is positive or negative using the logical complement operator
        boolean isPositive = !(number < 0);

        if (isPositive) {
            System.out.println("The number is positive.");
        } else {
            System.out.println("The number is negative.");
        }

        scanner.close();
    }
}
