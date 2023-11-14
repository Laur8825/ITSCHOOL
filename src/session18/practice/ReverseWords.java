package session18.practice;

import java.util.Arrays;
import java.util.Collections;

//Problem 5
//Given a sentence, reverse the order of the words in the sentence, but not the order of the letters in each word. For instance, "Java is fun" should become "fun is Java".
public class ReverseWords {

    public static void main(String[] args) {
        String sentence = "Java is very fun";

        String[] sencenceArray = sentence.split(" ");
        StringBuilder builder = new StringBuilder();

        for (int index = sencenceArray.length - 1; index >= 0; index--) {
            builder.append(sencenceArray[index] + " ");
        }

        System.out.println(builder);
        Collections.reverse(Arrays.asList(sencenceArray));
        System.out.println(Arrays.asList(sencenceArray));
    }

}
