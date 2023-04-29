package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex2 {

    public static void main(String[] args) {

        //Reverse all elements of a String array;
        String[] array={"hi","hello","take","go","there","tree"};


        for (int i = 0; i < array.length; i++) {
            array[i]=new StringBuilder(String.valueOf(array[i])).reverse().toString();
        }
        System.out.println(Arrays.toString(array));


    }
}
