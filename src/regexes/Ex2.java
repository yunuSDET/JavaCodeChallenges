package regexes;

public class Ex2 {

    public static void main(String[] args) {
        //Check if a given string starts with upper case letter and continues lower case letters
        String text="Hello";
        System.out.println(text.matches("[A-Z][a-z]+"));

    }
}
