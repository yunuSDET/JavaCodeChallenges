package loops;

public class Ex3 {

    public static void main(String[] args) {

//Write a program to print the Fibonacci sequence up to a given number using a do-while loop.

      int limit=10;
      int a=1;
      int b=1;
      int sum;

        System.out.print(a + "," + b);

      do{
          sum=a+b;
          System.out.print("," + sum);
          a=b;
          b=sum;

      }while (sum<limit);


    }

}
