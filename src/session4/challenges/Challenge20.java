package session4.challenges;

import java.util.Scanner;

//20. Write a Java program that takes three integer variables a, b, and c as input.
// Use nested ternary operators to find and print the largest number among the three.
public class Challenge20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first integer");
        int a = scanner.nextInt();

        System.out.println("Enter the second integer");
        int b=scanner.nextInt();

        System.out.println("Enter the third integer");
        int c=scanner.nextInt();

        int largest = (a>b)?((a>c)?a:c):((b>c)?b:c);
        System.out.println("The largest number among the three is " + largest);
        scanner.close();

    }


}