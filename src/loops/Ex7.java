package loops;

public class Ex7 {

    public static void main(String[] args) {

//Print first largest 100 numbers which is divisible by 2 and 3 not 5 less than 10000
        int counter=0;
        for (int i = 10000; i >=0 ; i--) {
            if( i % 2 ==0 && i % 3 ==0 && i %  5 !=0){
                counter++;
                System.out.println(i);
            }
            if(counter==100) break;

        }






    }
}
