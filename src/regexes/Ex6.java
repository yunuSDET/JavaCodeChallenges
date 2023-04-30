package regexes;

public class Ex6 {

    public static void main(String[] args) {

        //Find how many capital letters does a given string have

        String text = "Hi, my name is Yunus";
        int theNumberOfCapitalLetters = text.replaceAll("[^A-Z]", "").length();
        System.out.println(theNumberOfCapitalLetters);

    }
}
