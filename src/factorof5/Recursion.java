package factorof5;

public class Recursion {
            if(input==0 || input==1) {
        return 1;
    }
        else {
        return input * Factorial(num - 1);
    }
}
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        int num = in.nextInt();
        System.out.println("factorial of a number is" + fact(num));

    }
