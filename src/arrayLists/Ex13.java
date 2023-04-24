package arrayLists;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ex13 {

    public static void main(String[] args) {
//Add the first 1000 prime numbers to an ArrayList and print the ArrayList.
        ArrayList<Integer> list= IntStream.iterate(1,i->i+1)
                .filter(i->isPrime(i))
                .limit(1000)
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(list);


    }

    public static boolean isPrime(int number){
        if(number<2) return false;
        for (int i = 2; i < number; i++) {
            if (number % i ==0) return false;
        }
        return true;
    }
}
