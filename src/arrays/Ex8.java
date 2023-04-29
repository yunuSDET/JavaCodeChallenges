package arrays;

import java.util.Arrays;

public class Ex8 {

    public static void main(String[] args) {
        //Remove odd numbers from an array


        //First solution
        int[] array1={1,4,5,7,89,46,24};
        int[] newArray1=new int[array1.length];
        int index=0;
        for (int each : array1) {
          if(each % 2 ==0){
              newArray1[index++]=each;
          }
        }
        array1=Arrays.copyOf(newArray1,index);
        System.out.println(Arrays.toString(array1));



        //Second solution
        int[] array2={1,4,5,7,89,46,24};
        array2=Arrays.stream(array2)
                .filter(i->i % 2==0)
                .toArray();
        System.out.println(Arrays.toString(array2));




    }




}
