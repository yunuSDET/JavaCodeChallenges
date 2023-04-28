package loops;

public class Ex4 {

    public static void main(String[] args) {

//Find the sum of the digits of the numbers between 100 and 1000 with using for loops

        for (int i = 100; i <1000 ; i++) {
            int sum=0;
            for (int temp = i; temp >0 ; temp/=10) {
                   sum+=temp % 10;

            }
            System.out.println(i+ " ===> "+sum);
        }


    }
}
