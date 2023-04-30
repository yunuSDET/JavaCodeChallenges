package regexes;

public class Ex3 {

    public static void main(String[] args) {

        //Check if a given string has only 8 lower case letters
        String text="thanks";
        System.out.println(text.matches("[a-z]{8}"));


    }
}
