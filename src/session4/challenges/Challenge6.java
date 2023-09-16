package session4.challenges;

//6. Write a Java program where you declare an integer variable temperature.
// Assign a value to it and print "Hot" if the temperature is more than 30, "Warm" if the temperature is between 20 and 30, and "Cold" if it's less than 20.
public class Challenge6 {
    public static void main(String[] args) {
        int temperature = 31;
        if (temperature <= 30 && temperature >= 20) {
            System.out.println("Warm");
        } else if (temperature > 30) {
            System.out.println("Hot");
        } else {
            System.out.println("Cold");

        }
    }
}
