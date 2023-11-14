package session13.practice;

public class StringCompression {

    public static void main(String[] args) {
        System.out.println(compress("aaaaabbbb"));
    }

    public static String compress(String input){

        StringBuilder result=new StringBuilder();

        for(int index=0;index<input.length(); index++){
           int counter=1;
           while(index<input.length()-1 && input.charAt(index+1) == input.charAt(index)){
               counter++;
               index++;

           }
           result.append(input.charAt(index)).append(counter);
        }

        return result.toString();
    }
}
