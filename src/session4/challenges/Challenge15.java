package session4.challenges;

//15. Write a Java program where you declare an integer variable total with a value of 100.
// Use the compound assignment operator to decrease the total by 20 and then print the value.
// Next, use another compound assignment operator to multiply the total by 2 and then print the value.
public class Challenge15 {
    public static void main(String[] args) {
        int number = 100;
        number -= 20;
        System.out.println(number);
        number *= 2;
        System.out.println(number);
    }
}
