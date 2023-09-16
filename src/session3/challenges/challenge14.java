package session3.challenges;

import java.util.Scanner;

public class challenge14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input a number from the user
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Define the range
        int lowerLimit = 1;
        int upperLimit = 100;

        // Check if the number is within the specified range
        if (number >= lowerLimit && number <= upperLimit) {
            System.out.println("The number is within the range [" + lowerLimit + "-" + upperLimit + "].");
        } else {
            System.out.println("The number is outside the range [" + lowerLimit + "-" + upperLimit + "].");
        }

        scanner.close();
    }
}