package ARRAY2D;

import java.util.Scanner;

public class ARRAY2D {
    static void Print2DArray(int [] [] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr [i] [j]+ " ");
            }
            System.out.println();
        }


    }

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number Of Rows");
        int r = sc.nextInt();
        System.out.println("Enter The Number Of Columns");
        int c = sc.nextInt();
        int [] [] arr = new int [r] [c] ;
        System.out.println("Enter the " + r * c + " Elements Of Array");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr [i] [j] = sc.nextInt() ;
            }



        }
        Print2DArray(arr);
    }
}
