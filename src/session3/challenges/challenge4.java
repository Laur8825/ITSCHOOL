package session3.challenges;


//4. Write a Java program that uses both the increment (++) and decrement (--) operators in a loop to count up to 10 and then back down to 1
public class challenge4 {
    public static void main(String[] args) {
        // Count up to 10
        System.out.println("Counting up to 10:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // Count down to 1
        System.out.println("Counting down to 1:");
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
