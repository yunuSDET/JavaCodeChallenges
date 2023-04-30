package regexes;

public class Ex5 {

    public static void main(String[] args) {
        //Check if a given email is valid or not
        String email="kulcuy@gmail.com";
        System.out.println(email.matches("[\\w]+@[\\w]+\\.[\\w]+"));
    }
}
