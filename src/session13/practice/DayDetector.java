package session13.practice;

import java.util.Scanner;

public class DayDetector {
    public static void main(String[] args) {
        dayChecker("monday");
    }
    public static void  dayChecker(String day) {


        switch (day.toLowerCase()) {
            case "saturday", "sunday" -> System.out.println("It's a weekend day");
            case "monday" -> System.out.println("It's a weekday");
            case "tuesday" -> System.out.println("It's a weekday");
            case "wednesday" -> System.out.println("It's a weekday");
            case "thursday" -> System.out.println("It's a weekday");
            default -> System.out.println("Invalid day.");
        }
    }

}

