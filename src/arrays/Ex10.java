package arrays;

import java.util.Arrays;

public class Ex10 {

    public static void main(String[] args) {

        //Sort an int array from largest to smallest with using loops
        int[] array={3,4,6,11,43,1,2,5,65,8};

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if(array[j]<array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }

        System.out.println(Arrays.toString(array));

    }
}
