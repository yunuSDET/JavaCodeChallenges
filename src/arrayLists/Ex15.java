package arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Ex15 {

    public static void main(String[] args) {
        //Write a program to check if two ArrayLists have any common elements.
        ArrayList<Integer> list1=new ArrayList<>(Arrays.asList(1,4,7,3,2,3));
        ArrayList<Integer> list2=new ArrayList<>(Arrays.asList(7,2,9,90));
        boolean hasCommon=list1.stream().anyMatch(list2::contains);
        System.out.println(hasCommon);


    }
}
