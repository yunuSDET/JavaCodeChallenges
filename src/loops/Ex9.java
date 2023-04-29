package loops;

import java.util.Arrays;

public class Ex9 {


    public static void main(String[] args) {

 //Reverse an array
        int[] array={3,5,2,65,32,23};
        int[] reversedArray=new int[array.length];

        for (int i = array.length - 1; i >= 0; i--) {
            reversedArray[array.length-i-1]=array[i];
        }
        System.out.println(Arrays.toString(reversedArray));




    }
}
