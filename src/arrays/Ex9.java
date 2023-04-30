package arrays;

import java.util.Arrays;

public class Ex9 {


    public static void main(String[] args) {

        //Remove duplicate elements of an array

        //First solution
        int[] array1={1,4,5,7,1,46,24,4,7,46};
        int[] newArray1=new int[array1.length];
        int index=0;

        for (int i = 0; i < array1.length; i++) {
            int counter=0;
            for (int j = i; j < array1.length; j++) {
                if(array1[i]==array1[j]) counter++;
            }
            if(counter==1) newArray1[index++]=array1[i];
        }

        array1=Arrays.copyOf(newArray1,index);
        System.out.println(Arrays.toString(array1));


        //Second solution
        int[] array2={1,4,5,7,1,46,24,4,7,46};
        array2=Arrays.stream(array2).distinct().toArray();
        System.out.println(Arrays.toString(array2));



    }
}
