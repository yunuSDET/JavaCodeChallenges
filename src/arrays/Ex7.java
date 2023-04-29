package arrays;

import java.util.Arrays;

public class Ex7 {

    public static void main(String[] args) {

    //Print the words which start with a capital letter and has at least 4 letters

        //First solution
        String[] array1={"Hi","Hello","take","go","There","tree"};
        for (String each : array1) {
            if(Character.isUpperCase(each.charAt(0)) && each.length()>=4){
                System.out.println(each);
            }
        }

        //Second solution
        String[] array2={"Hi","Hello","take","go","There","tree"};
        Arrays.stream(array2)
                .filter(i->Character.isUpperCase(i.charAt(0)) && i.length()>=4)
                .forEach(System.out::println);


    }
}
