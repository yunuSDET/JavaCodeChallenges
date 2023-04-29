package arrays;

import java.util.Arrays;

public class Ex4 {

    public static void main(String[] args) {

        //Reverse a given array
        String[] array = {"hi", "hello", "take", "go", "there", "tree","application"};
        String [] reversedArray=new String[array.length];

        for (int i = array.length - 1; i >= 0; i--) {
            reversedArray[array.length-i-1]=array[i];
        }

        System.out.println(Arrays.toString(reversedArray));

    }
}
