package session3.challenges;

//2. Create a Java program where you increment and decrement the same variable. Display the value of the variable after each operation.
public class Challenge2 {
    public static void main(String[] args) {
        int myVariable = 5; // Initialize the variable with a value of 5

        // Increment the variable and display its value
        myVariable++;
        System.out.println("After incrementing, myVariable is now: " + myVariable);

        // Decrement the variable and display its value
        myVariable--;
        System.out.println("After decrementing, myVariable is now: " + myVariable);
    }
}

