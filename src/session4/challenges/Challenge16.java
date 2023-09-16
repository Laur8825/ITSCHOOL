package session4.challenges;

//16. Write a Java program where you use unary operators to perform a series of transformations on an integer variable number initialized to 50.
// First, negate number, then take the absolute value, and finally increment it by 1. Print the result at each step.
public class Challenge16 {
    public static void main(String[] args) {
        int number = 50;
        int negativeNumber = -number;
        int absoluteValue = Math.abs(number);
        int incrementedNumber = ++number;

        System.out.println(negativeNumber);
        System.out.println(absoluteValue);
        System.out.println(incrementedNumber);

    }
}
