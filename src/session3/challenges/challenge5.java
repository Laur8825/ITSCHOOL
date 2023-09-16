package session3.challenges;


//5. Create a Java program that demonstrates the use of each compound assignment operator with integers.
public class challenge5 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        // += (Addition Assignment)
        num1 += num2; // Equivalent to num1 = num1 + num2
        System.out.println("+= (Addition Assignment): " + num1);

        // -= (Subtraction Assignment)
        num1 -= num2; // Equivalent to num1 = num1 - num2
        System.out.println("-= (Subtraction Assignment): " + num1);

        // *= (Multiplication Assignment)
        num1 *= num2; // Equivalent to num1 = num1 * num2
        System.out.println("*= (Multiplication Assignment): " + num1);

        // /= (Division Assignment)
        num1 /= num2; // Equivalent to num1 = num1 / num2
        System.out.println("/= (Division Assignment): " + num1);

        // %= (Modulus Assignment)
        num1 %= num2; // Equivalent to num1 = num1 % num2
        System.out.println("%= (Modulus Assignment): " + num1);
    }
}
