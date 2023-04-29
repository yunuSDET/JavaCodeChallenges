package arrays;

import java.util.Arrays;

public class Ex5 {

    public static void main(String[] args) {

        //Find the sum of the longest and smallest elements of an array


        //First solution
        int[] array1={1,4,5,7,89,46,24};
        Arrays.sort(array1);
        int sum1=array1[0]+array1[array1.length-1];
        System.out.println(sum1);


        //Second solution
        int[] array2={1,4,5,7,89,46,24};
        int max=array2[0];
        int min=array2[0];
        for (int each : array2) {
            if(max<each) max=each;
            if(min>each) min=each;
        }
        int sum2=min+max;
        System.out.println(sum2);





    }
}
