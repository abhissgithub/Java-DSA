package PATTERN;
/*
         *
        * *
       * * *
      * * * *
     * * * * *
      * * * *
       * * *
        * *
         *

 */

import java.util.Scanner;

public class UPNDOWNTRIANGLES {
    static void tri(int n){
        for (int i=0;i<2*n;i++) {
            int totcol = i > n  ?  2 * n - i : i;
            int spaces = n - totcol;
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }
            for (int j = 0; j < totcol; j++) {
                System.out.print("* ");

            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        tri(n);
    }
}
