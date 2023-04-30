package regexes;

public class Ex1 {

    public static void main(String[] args) {

        //Check if a given string contains only alphabetic characters
        String text = "hello";

        System.out.println(text.matches("[a-zA-Z]+"));


    }
}
