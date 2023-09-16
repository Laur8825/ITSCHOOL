package session4.challenges;

//1. Write a Java program where you create two String objects named stringOne and stringTwo with the same value "OpenAI".
// Check and print whether they refer to the same object.

public class Challenge1 {

    public static void main(String[] args) {
        String stringOne = "OpenAI";
        String stringTwo = "OpenAI";

        //check if strings are the same
        boolean areSame = stringOne==stringTwo;

        if (areSame) {
            System.out.println("they refer to the same object.");
        } else {
            System.out.println("they do not refer to the same object.");
        }

    }


}
