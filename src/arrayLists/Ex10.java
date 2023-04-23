package arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinWorkerThread;
import java.util.stream.Collectors;

public class Ex10 {

    public static void main(String[] args) {
//Given an ArrayList,
// find the duplicate elements and return them in a new ArrayList.
        ArrayList<String> words = new ArrayList<>(Arrays.asList("hi", "hello", "take", "get", "go", "help", "hi", "take"));
        ArrayList<String> newWords = words.stream()
                .filter(i -> words.indexOf(i) != words.lastIndexOf(i))
                .distinct()
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(newWords);

    }
}
