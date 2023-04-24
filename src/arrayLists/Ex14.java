package arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Ex14 {

    public static void main(String[] args) {
        //Write a program to find the second highest number in an ArrayList of integers.
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 4, 6, 1, 12, 34, 65, 2, 12, 3, 5, 4));
        int secondHigest=numbers.stream().distinct()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .skip(1)
                .findFirst().getAsInt();


    }
}
