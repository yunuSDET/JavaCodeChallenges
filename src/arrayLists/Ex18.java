package arrayLists;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class Ex18 {

    public static void main(String[] args) {

        //Add all numbers in the range 100,100000 in an ArrayList
        //and reverse each element of ArrayList
        //and find the sum of all numbers

        //First solution
        ArrayList<Integer> numbers=new ArrayList<>();
        for (Integer i = 100; i <=100000 ; i++) {
            numbers.add(i);
        }

        int sum1=0;
        for (int i = 0; i < numbers.size(); i++) {
            Integer element=numbers.get(i);
            Integer reversedElement=Integer.parseInt(new StringBuilder(String.valueOf(element)).reverse().toString());
            numbers.set(i,reversedElement);
            sum1+=reversedElement;
        }
        System.out.println(sum1);


        //Second solution
        int sum2=IntStream.rangeClosed(100,100000)
                .map(i->Integer.parseInt(new StringBuilder(String.valueOf(i)).reverse().toString()))
                .sum();
        System.out.println(sum2);



    }
}
