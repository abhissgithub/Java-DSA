package RECURSION;

import java.util.Scanner;

public class RECURSIONSIGNSUM {
    static int evenoddsum(int n){
        if(n==0) return 0;
        if (n%2==0)
            return evenoddsum(n-1)-n;
        else
            return evenoddsum(n-1)+n;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(evenoddsum(n));
    }

}
