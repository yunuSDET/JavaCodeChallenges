package arrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;


public class Ex17 {

    public static void main(String[] args) {

//Add random 1000 numbers in range 1,100 in an ArrayList and find the number which
//has the biggest frequency
        Random random = new Random();

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 1000; i++) {
            numbers.add(random.nextInt(100) + 1);
        }



        //First solution
        int theBiggestFrequency = 0;
        for (Integer i = 1; i <= 100; i++) {
            int frequencyOfI = Collections.frequency(numbers, i);
            if (theBiggestFrequency < frequencyOfI) {
                theBiggestFrequency = frequencyOfI;
            }
        }
        System.out.println(theBiggestFrequency);


        //Second solution
        int maxFre = numbers.stream()
                .map(i -> Collections.frequency(numbers, i))
                .distinct()
                .mapToInt(Integer::intValue)
                .max().getAsInt();
        System.out.println(maxFre);


    }
}
