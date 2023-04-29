package arrays;

import java.util.Arrays;

public class Ex6 {


    public static void main(String[] args) {

    //Find the sum of even numbers of an array
        //First solution
        int[] array1={1,4,5,7,89,46,24};
        int sum1=0;
        for (int each : array1) {
            if(each % 2==0) sum1+=each;
        }
        System.out.println(sum1);

        //Second solution
        int[] array2={1,4,5,7,89,46,24};
        int sum2= Arrays.stream(array2).filter(i->i % 2 ==0).sum();
        System.out.println(sum2);


    }
}
