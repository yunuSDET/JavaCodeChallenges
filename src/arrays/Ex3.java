package arrays;

public class Ex3 {

    public static void main(String[] args) {

        //Find the longest word of a string array

        String[] array = {"hi", "hello", "take", "go", "there", "tree","application"};

        String longestString = array[0];
        int longest = longestString.length();

        for (String each : array) {

            if (longest < each.length()) {
                longest = each.length();
                longestString = each;
            }

        }

        System.out.println(longestString);

    }


}
