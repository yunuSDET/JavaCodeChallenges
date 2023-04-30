package regexes;

public class Ex4 {

    public static void main(String[] args) {

        //Find how many digits does a given string have
        String text="hello90";
        int theNumberOfDigits=text.replaceAll("[^0-9]", "").length();
        System.out.println(theNumberOfDigits);


    }
}
