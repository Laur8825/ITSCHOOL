package session13.practice;

import java.util.Scanner;

public class StringFormatter {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your name");
        String name = scanner.nextLine();
        System.out.println("Please enter your age");
        int age = scanner.nextInt();

        String result = String.format("%s is %s years old", name, age);
        System.out.println(result);

    }
}
