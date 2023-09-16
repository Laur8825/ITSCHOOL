package session4.challenges;

//8. Write a Java program to calculate the factorial of a number using a for loop. Declare an integer variable number and assign a value to it.
// Then calculate and print the factorial of number.
public class Challenge8 {
    public static void main(String[] args) {
        int fact = 1;
        int number = 5;

        for (int i = 1; i <= number; i++) {
            fact = fact * i;
        }

        System.out.println("The factorial number for " + number + " is " + fact);
    }
}

