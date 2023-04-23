package arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Ex8 {

    public static void main(String[] args) {

//Create an ArrayList of integers and partition it into
// sub-ArrayLists of a given size.
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 4, 6, 1, 12, 34, 65, 2));

        int subNumber = 3;
        List<Integer> subLists;
        for (int i = 0; i < numbers.size(); i += subNumber) {
            if (i + subNumber > numbers.size()) {
                subLists = numbers.subList(i, numbers.size());
            } else {
                subLists = numbers.subList(i, i + subNumber);

            }
            System.out.println(subLists);
        }


    }
}
