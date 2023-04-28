package loops;

public class Ex5 {

    public static void main(String[] args) {

        //Find the prime numbers up to 1000 with using loops

        boolean isPrime;

        for (int each= 2; each < 1000; each++) {

            isPrime=true;

            for (int j = 2; j <each ; j++) {
                if(each % j==0) {
                    isPrime=false;
                    break;
                }
            }

            if (isPrime) System.out.println(each);

        }


    }
}
