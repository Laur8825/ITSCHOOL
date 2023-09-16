package session3.challenges;

import java.util.Scanner;

//12. Create a program that takes an integer as input and then increments and decrements it by 1, displaying the output at each stage.
public class challenge12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input an integer
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Increment the number by 1 and display the result
        int incrementedNumber = number + 1;
        System.out.println("After incrementing by 1: " + incrementedNumber);

        // Decrement the number by 1 and display the result
        int decrementedNumber = number - 1;
        System.out.println("After decrementing by 1: " + decrementedNumber);

        scanner.close();
    }
}