package session4.challenges;

import java.sql.SQLOutput;

//18. Write a Java program where you declare an integer array with 5 elements.
// Use a for loop to initialize the array such that each element is equal to its index incremented by 1.
// Then use another for loop to decrement each element by 1.
// Print the array before and after the decrement operation using a for-each loop.
public class Challenge18 {
    public static void main(String[] args) {
        int[] myIntArray = {1, 2, 3, 4, 5};

        for(int element:myIntArray){
            System.out.println("Array Before increment "+ element);
        }
        for (int element : myIntArray) {
            element+=1;
            System.out.println("Array after increment " + element);
        }
    }
}
