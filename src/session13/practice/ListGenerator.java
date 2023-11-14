package session13.practice;

import java.util.ArrayList;
import java.util.List;

public class ListGenerator {

    public static void main(String[] args) {
        List<String> cityNames = new ArrayList<>();
        cityNames.add("New york");
        cityNames.add("Los angeles");
        cityNames.add("Chicago");
        cityNames.add("Houston");
        cityNames.add("Phoenix");

        List<String>results=new ArrayList<>();

        String secondElement=cityNames.get(1);
        results.add(secondElement);

        String fourthElement=cityNames.get(3);
        results.add(fourthElement);

        System.out.println(results);
    }
}
