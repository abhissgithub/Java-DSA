package PATTERN;

import java.util.Scanner;

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
public class ROTATEDTRIANGLE {
    static void tri(int n) {
        int i = 0;
        int j = 0;

            for (i = 0; i < 2 * n; i++) {
                int totalcol = i>n ? 2*n-i: i;
                for (j = 0; j <=totalcol; j++) {
                    System.out.print("* ");
                }
                System.out.println(" ");

            }


            }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        tri(n);
    }
}
