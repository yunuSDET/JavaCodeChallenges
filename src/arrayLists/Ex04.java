package arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Ex04 {

    public static void main(String[] args) {
        //Create an ArrayList of strings and remove all duplicate elements.

        ArrayList<String> words = new ArrayList<>(Arrays.asList("hi", "hello", "take", "get", "go", "help", "hi", "take"));
        words = words.stream()
                .distinct()
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(words);


    }
}
