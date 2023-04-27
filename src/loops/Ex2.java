package loops;

public class Ex2 {

    public static void main(String[] args) {
//Write a program to find the sum of the first n numbers using a for loop.
        int sum=0;
        int n=20;
        for (int i = 1; i <= n; i++) {
            sum+=i;
        }
        System.out.println(sum);


    }
}
