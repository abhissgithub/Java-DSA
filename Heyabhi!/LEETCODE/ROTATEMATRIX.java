package LEETCODE;

import java.util.ArrayList;
import java.util.Scanner;

class ROTATEMATRIX {

    //    Helper method to print 2D array
    static void Print2DArray(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    //    we have to transpose the matrix
    static void TransposeArray(int [][] arr,int r,int c){
        for (int i=0;i<c;i++){
            for (int j=i;j<r;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;

            }
        }
    }
    //    Method for reverse the single row in matrix
    static void reverse( int [] arr ) {
        int i = 0;
        int j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    //    Now we have to rotate array properly for which we've found transpose and also written method for reverse the single row
    //        here given matrix is square so it has same r & c.//        1. Transpose the array
    //        2. reverse the rows in array
static  void Rotatearray(int [][] matrix,int n) {
    TransposeArray(matrix, n, n);
    for (int i = 0; i < n; i++) {
        reverse(matrix[i]);

    }

}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Rows And Columns of Matrix");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int Totalelement = r * c;
        int[][] matrix = new int[r][c];
        System.out.println("Enter Total " + Totalelement + " Elements of matrix");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();


            }
        }
        System.out.println("The Given Matrix Is");
        Print2DArray(matrix);
        Rotatearray(matrix,r);
        System.out.println("Rotated array is");
        Print2DArray(matrix);


    }
}
