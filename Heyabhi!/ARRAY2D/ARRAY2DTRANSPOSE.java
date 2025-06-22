package ARRAY2D;// TRANSPOSE OF MATRIX //

import java.util.Scanner;

public class ARRAY2DTRANSPOSE {
    static void Print2DArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int [] [] TransposeArray(int [] [] a,int r, int c){
        int [] [] transpose = new int [c] [r];

        for (int i=0;i>c;i++){
            for (int j=0;j>r;j++){
                transpose[c][r]=a[j][r];
            }
        }
        return transpose;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Rows And Columns of Matrix");
        int r= sc.nextInt();
        int c= sc.nextInt();
        int Totalelement= r*c;
        int [] [] arr = new int[r][c];
        System.out.println("Enter Total "+ Totalelement+" Elements of matrix");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();


            }
        }
        System.out.println("The Given Matrix Is");
        Print2DArray(arr);
        System.out.println("The Transpose Of given Matrix is");
        int [] [] trans = TransposeArray(arr,r,c);
        Print2DArray(trans);
    }
}
