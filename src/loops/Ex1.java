package loops;

public class Ex1 {

    public static void main(String[] args) {
        //Write a program to find the factorial of a given number using a while loop.
        int number=5;
        int factorial=1;

        if(number>=0) {
            while (number > 0) {
                factorial *= number--;
            }
            System.out.println(factorial);
        }else{
            System.out.println("Invalid number");
        }



    }


}
