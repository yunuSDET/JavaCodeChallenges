package arrayLists;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex1 {

    public static void main(String[] args) {
        //Create an ArrayList of integers, remove all even numbers,
        // and then find the sum of the remaining elements.

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 4, 6, 1, 12, 34, 65, 2));
        numbers.removeIf(i -> i % 2 == 0);

        int sumOfRemainingElements = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println(sumOfRemainingElements);


    }
}
