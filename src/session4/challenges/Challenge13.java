package session4.challenges;

//13. Write a Java program where you declare two boolean variables isRaining and isSunny with values of true and false, respectively.
// Use the logical complement operator to negate the values of both variables and print the new values.
public class Challenge13 {
    public static void main(String[] args) {
        boolean isRaining = true;
        boolean isSunny = false;

        isRaining = !true;
        isSunny = !false;

        System.out.println(isRaining);
        System.out.println(isSunny);
    }
}
