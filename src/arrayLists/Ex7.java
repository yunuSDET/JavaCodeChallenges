package arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Ex7 {

    public static void main(String[] args) {
//Given an ArrayList of integers,
// rotate the elements to the right by a given number of steps.

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 4, 6, 1, 12, 34, 65, 2));
        int rotate = 6;
        Collections.rotate(numbers, rotate);

        System.out.println(numbers);


    }
}
