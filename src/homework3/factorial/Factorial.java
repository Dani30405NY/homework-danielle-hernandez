package homework3.factorial;


import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        System.out.println("enter number");
        int num = in.nextInt();
        System.out.println("factorial of a number is" + fact(num));

    }
    public static int fact(int num){

      if (num >= 1) {
          return num * fact(num -1);
      } else {
          return 1;
      }



    }
}

