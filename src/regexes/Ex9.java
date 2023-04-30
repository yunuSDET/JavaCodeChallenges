package regexes;

public class Ex9 {

    public static void main(String[] args) {

        //Print the domain name of a given email
        String email="kulcuy@gmail.com";
        String domain=email
                .replaceAll("[\\w]+@","")
                .replaceAll("\\.[\\w]+","");
        System.out.println(domain);


    }
}
