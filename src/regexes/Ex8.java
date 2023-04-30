package regexes;

import java.nio.channels.WritePendingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Ex8 {

    public static void main(String[] args) {

        //Print the strings which has only alphabetic characters in an ArrayList

        //First solution
        ArrayList<String> words = new ArrayList<>(Arrays.asList("hi90", "hello", "take", "go"));
        words.removeIf(i -> i.replaceAll("[^0-9]", "").length() > 0);
        System.out.println(words);


        //Second solution
        ArrayList<String> words2 = new ArrayList<>(Arrays.asList("hi90", "hello", "take", "go"));
        words2=words2.stream()
                .filter(i-> i.replaceAll("[^0-9]", "").length() == 0)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(words2);



    }
}
