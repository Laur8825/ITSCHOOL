package session4.challenges;

import java.util.ArrayList;

//10. Write a Java program that creates two distinct ArrayList objects, listOne and listTwo.
// Add some elements to listOne and assign listOne to listTwo. Now modify listOne by adding a new element. Print both lists and observe the output.

public class Challenge10 {
    public static void main(String[] args) {
        ArrayList<String> listOne = new ArrayList<String>();
        ArrayList<String> listTwo = new ArrayList<String>();

        listOne.add("element4");
        listOne.add("element2");
        listOne.add("element3");


        listTwo.addAll(listOne);

        System.out.println(listOne);
        System.out.println(listTwo);
    }

}
