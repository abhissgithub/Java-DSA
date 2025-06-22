package PATTERN;
/*
 1
 1 2
 1 2 3
 1 2 3 4
 1 2 3 4 5
 */

import java.util.Scanner;

public class INCREASINGDIGITS {
    static void digits(int n){

        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){

                System.out.print(j+" ");

            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        digits(n);
    }
}
