package arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Ex05 {

    public static void main(String[] args) {
        //Given an ArrayList of integers, find the first two largest elements.
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 5, 7, 9, 23, 54, 6));
        list.stream()
                .sorted(Collections.reverseOrder())
                .limit(2)
                .forEach(System.out::println);

    }
}
