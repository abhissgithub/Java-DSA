package RECURSION;

import java.util.Scanner;

public class RECURSIONFIBONACCI {
    static int Fibonaci(int n){
        if (n==0 || n==1){         //OR operator
            return n;
        }
        int prev=Fibonaci(n-1);
        int prevprev=Fibonaci(n-2);
        int ans = prev+prevprev;
        return ans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(Fibonaci(n));
    }
}
