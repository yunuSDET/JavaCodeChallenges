package arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Ex03 {

    public static void main(String[] args) {
        //Given two ArrayLists of integers,
        // return a new ArrayList containing only the elements
        // that appear in both lists.

        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 5, 7, 9, 23, 54, 6));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(2, 3, 4, 5, 6));

        ArrayList<Integer> commonElements = list1.stream().distinct()
                .filter(i -> list2.contains(i))
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(commonElements);


    }
}
