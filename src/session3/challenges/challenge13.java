package session3.challenges;

import java.util.Scanner;

//13. Write a program to calculate the price after discount. Take the original price and discount percentage as input. Use compound assignment operator to perform the calculation.
public class challenge13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the original price
        System.out.print("Enter the original price: ");
        double originalPrice = scanner.nextDouble();

        // Input the discount percentage
        System.out.print("Enter the discount percentage (e.g., 10 for 10%): ");
        double discountPercentage = scanner.nextDouble();

        // Calculate the discounted price using the compound assignment operator
        discountPercentage /= 100; // Convert the percentage to a decimal
        double discountedPrice = originalPrice * (1 - discountPercentage);

        // Display the result
        System.out.println("Original price: $" + originalPrice);
        System.out.println("Discount percentage: " + discountPercentage * 100 + "%");
        System.out.println("Price after discount: $" + discountedPrice);

        scanner.close();
    }
}