package loops;

import java.util.Scanner;

public class Ex10 {

    public static void main(String[] args) {

        //Take 10 numbers from user and print the largest of them
        Scanner input=new Scanner(System.in);

        int largest=Integer.MIN_VALUE;

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter "+(i+1)+". number :");
            int number=input.nextInt();
            if(largest<number) largest=number;
        }

        System.out.println("Largest number is "+largest);

    }
}
