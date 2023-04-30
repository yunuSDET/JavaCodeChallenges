package regexes;

public class Ex7 {

    public static void main(String[] args) {

        //Check if a given string have
        // at least a digits, an upper case letter and a lower case letters
        String text="Hello90";
        boolean hasDigit=text.replaceAll("[^0-9]","").length()>0;
        boolean hasLowerCase=text.replaceAll("[^a-z]","").length()>0;
        boolean hasUpperCase=text.replaceAll("[^A-Z]","").length()>0;
        System.out.println(hasDigit && hasUpperCase && hasLowerCase);


    }
}
