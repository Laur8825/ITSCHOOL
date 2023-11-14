package session13.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomIntegers {

    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<>();
        Random randomGenerator = new Random();
        randomGenerator.nextInt();

        for (int counter = 0; counter < 7; counter++) {
            integers.add(randomGenerator.nextInt(100));


        }
        System.out.println(integers);
        System.out.println(getSmallest(integers));

    }

    public static int getSmallest(List<Integer> integers) {
        int smallest = integers.get(0);
        for (int number : integers) {
            if (number < smallest) {
                smallest = number;
            }

        }
        return smallest;
    }

}
