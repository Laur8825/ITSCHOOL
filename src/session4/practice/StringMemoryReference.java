package session4.practice;

public class StringMemoryReference {
    public static void main(String[] args) {
        String greeting = new String("Hello");
        String greetingOne = "hello";
        String greetingTwo = "Hello";

        System.out.println(greetingOne==greetingTwo); //false
        System.out.println(greetingOne.equals(greetingTwo)); //false

        System.out.println(greeting==greetingOne);//false
        System.out.println(greeting.equals(greetingOne));//false
    }
}
