package RECURSION;

import java.util.Scanner;

public class RECURSIONSUMOFDIGITS {
    static int sod(int n){
        if (n>=0 && n<=9) return n;
        return sod(n/10)+n%10;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(sod(n));
    }

}
