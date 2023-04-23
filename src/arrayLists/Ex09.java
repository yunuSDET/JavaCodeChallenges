package arrayLists;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex09 {


    public static void main(String[] args) {

//Create an ArrayList of strings and remove all elements
// that contain a specific character.
        ArrayList<String> words = new ArrayList<>(Arrays.asList("hi", "hello", "take", "get", "go", "help", "hi", "take"));
        String character = "e";
        words.removeIf(i -> i.contains(character));
        System.out.println(words);


    }
}
