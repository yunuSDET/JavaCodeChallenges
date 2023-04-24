package arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.stream.Collectors;

public class Ex11 {

    public static void main(String[] args) {
//Create an ArrayList with some duplicate elements and
// find all the duplicates in the ArrayList.

        //First solution
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(3, 4, 6, 1, 12, 34, 65, 2, 12, 3, 5, 4));
        ArrayList<Integer> duplicates = numbers.stream()
                .filter(i -> Collections.frequency(numbers, i) > 1)
                .distinct()
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(duplicates);


        //Second solution
        ArrayList<Integer> numbers2 = new ArrayList<>(Arrays.asList(3, 4, 6, 1, 12, 34, 65, 2, 12, 3, 5, 4));
        numbers2.removeIf(i->Collections.frequency(numbers2,i)==1);
        ArrayList<Integer> duplicates2 =numbers2.stream()
                .distinct()
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(duplicates2);


        //Third solution
        ArrayList<Integer> numbers3 = new ArrayList<>(Arrays.asList(3, 4, 6, 1, 12, 34, 65, 2, 12, 3, 5, 4));
        ArrayList<Integer> duplicates3=new ArrayList<>();
        for (int i = 0; i < numbers3.size(); i++) {
           if(Collections.frequency(numbers3,numbers3.get(i))>1 && !duplicates3.contains(numbers3.get(i))) {
               duplicates3.add(numbers3.get(i));
           }
        }
        System.out.println(duplicates3);


        //Fourth Solution
        ArrayList<Integer> numbers4 = new ArrayList<>(Arrays.asList(3, 4, 6, 1, 12, 34, 65, 2, 12, 3, 5, 4));
        HashSet<Integer> duplicates4=numbers4.stream()
                .filter(i->Collections.frequency(numbers4,i)>1).collect(Collectors.toCollection(HashSet::new));
        System.out.println(duplicates4);


    }
}
