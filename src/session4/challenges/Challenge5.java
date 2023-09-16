package session4.challenges;

//5. Write a Java program to print the numbers from 1 to 10 using a for loop. As a next step, modify your program to print only the even numbers from 1 to 10.
public class Challenge5 {

    public static void main(String[] args) {
        System.out.println("Print numbers from 1 to 10 using for loop");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        //modify your program to print only the even numbers from 1 to 10.
        System.out.println("Print even numbers from 1 to 10");
        for (int i = 2; i <= 10; i += 2) {
            System.out.println(i);
        }

    }
}
