package session4.challenges;

import java.sql.SQLOutput;

//7. Write a Java program that determines the type of a triangle based on its sides. Declare three variables sideOne, sideTwo and sideThree to represent the sides of the triangle.
// Use the ternary operator to determine and print whether the triangle is "Equilateral", "Isosceles", or "Scalene".
public class Challenge7 {
    public static void main(String[] args) {
        int sideOne = 4;
        int sideTwo = 4;
        int sideThree = 5;

        boolean equilateralTriangle = sideOne == sideTwo && sideTwo == sideThree;
        boolean isoscelesTriangle = sideOne == sideTwo && sideTwo != sideThree || sideOne != sideTwo && sideTwo == sideThree || sideOne != sideThree && sideThree == sideTwo;
        boolean scaleneTriangle = sideOne != sideTwo && sideTwo != sideThree && sideOne != sideThree;

        if (equilateralTriangle) {
            System.out.println("The triangle is equilateral");

        } else if (isoscelesTriangle) {
            System.out.println("The triangle is an isosceles");
        } else {
            System.out.println("The triangle is scalene");

        }
    }
}