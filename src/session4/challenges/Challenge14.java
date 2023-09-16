package session4.challenges;

//14. Write a Java program where you declare an integer variable counter with a value of 0.
// Use the increment operator to increase the value of counter by 1 and then print the value.
// After that, use the decrement operator to decrease the value of counter by 1 and then print the value.
public class Challenge14 {
    public static void main(String[] args) {
        int number = 0;
        int incrementedNumber = ++number;
        System.out.println("Incremented Number " + incrementedNumber);
        int decrementedNumber = --number;
        System.out.println("Decremented Number " + decrementedNumber);


    }
}
