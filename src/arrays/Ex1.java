package arrays;

import java.util.Arrays;

public class Ex1 {

    public static void main(String[] args) {

        //Find the average of an array
        int[] array={1,4,5,7,89,46,24};

        //first solution
        double sum=0.0;
        for (int each : array) {
            sum+=each;
        }
        System.out.println(sum/array.length);

        //Second soluiton
        double average=Arrays.stream(array).average().getAsDouble();
        System.out.println(average);


    }
}
