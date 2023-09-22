package session6.practice;

public class StringVsStringBuilder {

    public static void main(String[] args) {
        //usig String
        String str = "";
        for (int index = 0; index < 10; index++) {
            str += "word" + index + " ";
        }

        System.out.println("Final string using String: " + str);

        //using StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
        for (int index = 0; index < 10; index++) {
            stringBuilder.append("word").append(index).append(" ");
        }

        System.out.println("Final stringBuilder using StringBuilder: " +stringBuilder);
        System.out.println("Final stringBuilder revers is : " +  stringBuilder.reverse());

        String name = "John";//immutable
     String nameUpdated = name.replace('h','a');
        System.out.println(nameUpdated);

    }
}
