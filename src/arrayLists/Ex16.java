package arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ex16 {

    public static void main(String[] args) {
        //Write a program to list the common elements of two ArrayLists.
        ArrayList<Integer> list1=new ArrayList<>(Arrays.asList(1,4,7,3,2,3));
        ArrayList<Integer> list2=new ArrayList<>(Arrays.asList(7,2,9,90));
        List<Integer> newList=list1.stream()
                .distinct()
                .filter(list2::contains)
                .collect(Collectors.toList());
        System.out.println(newList);


    }
}
