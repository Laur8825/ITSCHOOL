package session3.challenges;

import java.util.Scanner;

//8. Create a program that takes two byte values, adds them together, and stores the result in a byte variable.
public class challenge8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the first byte value
        System.out.print("Enter the first byte value: ");
        byte byte1 = scanner.nextByte();

        // Input the second byte value
        System.out.print("Enter the second byte value: ");
        byte byte2 = scanner.nextByte();

        // Perform the addition and store the result in a byte variable
        byte result = (byte) (byte1 + byte2);

        System.out.println("Result of addition: " + result);

        scanner.close();
    }
}