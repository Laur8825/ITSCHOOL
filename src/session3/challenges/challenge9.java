package session3.challenges;

//9. Write a program that calculates the area of a rectangle. Take the length and breadth as inputs.
import java.util.Scanner;

public class challenge9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the length of the rectangle
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();

        // Input the breadth of the rectangle
        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = scanner.nextDouble();

        // Calculate the area of the rectangle
        double area = length * breadth;

        // Display the result
        System.out.println("The area of the rectangle is: " + area);

        scanner.close();
    }
}