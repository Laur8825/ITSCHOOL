package session6.practice;

public class StringMethodsPractice {

    public static void main(String[] args) {

        String name = "John Doe";
        printStringLenght("Test");
        printStringCharAt("Alice", 0);
        //                       01234
        printStringIndexAt("Alice","i");
        printSubstring("Hello World" , 6,11);
        System.out.println(name.substring(5,8));
        System.out.println(name.substring(5));

        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        System.out.println("John Doe contains Doe: "+ name.contains("Doe"));

        System.out.println("Replaced 'e' from Hello: " + "Hello".replace('e','a'));

        String email = "user@google.com";
        String domain = email.substring(email.indexOf('@') +1);
        System.out.println("The domain name is : " + domain);

    }


    private static void printStringLenght(String input) {
        System.out.println("String input lenght: " + input.length());
    }

    private static void printStringCharAt(String input, int index) {
        System.out.println("The carachert at index  is: " + input.charAt(index));
    }

    private static void printStringIndexAt(String input, String target) {
        System.out.println("The index of target is :" + input.indexOf(target));
    }

    private static void printSubstring(String input , int startIndex, int endIndex){
        System.out.println("The substring is: " + input.substring(startIndex , endIndex));
    }


}
