package arrayLists;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ex12 {

    public static void main(String[] args) {
//Add the first 1000 numbers that are divisible by 3 or 5 but not by 2 to an ArraysList

        //First solution
        ArrayList<Integer> numbers = IntStream.iterate(1, n -> n + 1)
                .filter(i -> ((i % 3 == 0) || (i % 5 == 0)) && i % 2 != 0)
                .limit(1000)
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(numbers);




        //Second solution
        ArrayList<Integer> numbers2 = new ArrayList<>();
        int counter=0;
        int number=1;
        while (true){
            if((number % 3 == 0 || number % 5 == 0) && number % 2 != 0){
                numbers2.add(number);
                counter++;
            }
            number++;
            if(counter==1000) break;
        }
        System.out.println(numbers2);


        //Third solution
        ArrayList<Integer> numbers3 = IntStream.rangeClosed(1,Integer.MAX_VALUE)
                .filter(i -> ((i % 3 == 0) || (i % 5 == 0)) && i % 2 != 0)
                .limit(1000)
                .boxed()
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(numbers3);



    }
}
