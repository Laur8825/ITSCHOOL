package session4.challenges;

//2. Write a Java program to declare two integer variables firstNumber and secondNumber with any values.
// Use an equality operator to compare these two numbers and print the result.
// Do the same for two String objects firstString and secondString with the same value, but use the equals() method for comparison. Print the result.

import java.sql.SQLOutput;

public class Challenge2 {
    public static void main(String[] args) {
        int firstNumber = 5;
        int secondNumber = 10;

        //comparing the two numbers
        boolean areSame = firstNumber == secondNumber;
        if (areSame) {
            System.out.println("The numbers are the equal");
        } else {
            System.out.println("The numbers are not equal");
        }

        //comparing two string with .equals()
        String stringOne = "Dog";
        String stringTwo = "Dog";
        boolean stringEquality = stringOne.equals(stringTwo);
        if (stringEquality) {
            System.out.println("The strings are the same");
        } else {
            System.out.println("The strings are not the same");
        }

    }

}

