package loops;

import java.util.Arrays;

public class Ex8 {

    public static void main(String[] args) {

        //Print all numbers whose digits are ordered from smallest to largest in range 100,10_000

        for (int i = 100; i<10_000 ; i++) {

            boolean isOrdered=true;
            int temp=i;

            while (temp>0){
                int digit1=temp % 10;
                temp/=10;
                int digit2=temp % 10;
                if(digit1<=digit2) {
                    isOrdered=false;
                    break;
                }
            }

            if (isOrdered) System.out.println(i);
        }


    }
}
