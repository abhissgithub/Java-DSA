package RECURSION;

import java.util.Scanner;

public class RECURSIONFACTORIAL {
    static int factorial(int n){  //5*4*3*2*1
        if (n==0){
            return 1;
        }
        int fact=n* factorial(n-1);
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(factorial(n));
    }

}
