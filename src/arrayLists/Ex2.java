package arrayLists;

import java.net.CookieHandler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Ex2 {

    public static void main(String[] args) {
        //Create an ArrayList of strings and
        // sort it in descending order based on the length of the strings.

        ArrayList<String> words = new ArrayList<>(Arrays.asList("hi", "hello", "take", "get", "go", "help"));
        Collections
                .sort(words, Comparator.comparing(String::length).reversed());
        System.out.println(words);


    }
}
