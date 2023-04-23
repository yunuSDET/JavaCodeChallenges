package arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Ex6 {

    //Create an ArrayList of integers and find the subarray with the maximum sum.
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,5,7,9,23,54,6));
        //task is not clear, so I assumed that I must check each two numbers

        Collections.sort(list,Collections.reverseOrder());
        int maxSum=list.get(0)+list.get(1);
        System.out.println(maxSum);


    }




}
