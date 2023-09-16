package session4.challenges;
import java.util.Scanner;

//19. Write a Java program that takes an integer variable age as input.
// Use a ternary operator to classify the person into one of the following categories: "Child" (age < 12),
// "Teenager" (age between 12 and 17), "Adult" (age between 18 and 64), and "Senior" (age 65 and above).
// Print the resulting classification.
public class Challenge19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input the age
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        // Use a ternary operator to classify the age
        String classification = (age < 12) ? "Child"
                : (age >= 12 && age <= 17) ? "Teenager"
                : (age >= 18 && age <= 64) ? "Adult"
                : "Senior";

        // Print the resulting classification
        System.out.println("You are classified as a " + classification);

        input.close();
    }
}

