package ARRAY2D;

import java.util.Scanner;

public class ARRAY2DSETMATRIXZERO {
        static void Print2DArray(int[][] arr) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }

        static void setmatrix(int[][] arr) {

            boolean firstrow=false, firstcol=false;

            // We check (0)th row and (0)th column (ie we  arr[0)[0]) is zero or not.
            for (int i=0;i< arr.length;i++){
                for (int j=0;j<arr[0].length;j++){
                    if (arr[i][j]==0){
                        if (i==0) firstrow=true;
                        if (j==0)firstcol=true;
                        arr[0][j]=0;
                        arr[i][0]=0;
                    }
                }
            }
//        Now We Traverse from 1st row and column and if there is zero we make entire row and column zero.
            for (int i=1;i<arr.length;i++){
                for (int j=1;j<arr[0].length;j++){
                    if (arr[i][0]==0 || arr[0][j]==0){
                        arr[i][j]=0;
                    }
                }
            }
////        Now, if arr[0][0] is 0 then we make that row and column 0.
            if (firstrow){
                for (int j=0;j< arr[0].length;j++){
                    arr[0][j]=0;
                }
                if (firstcol){
                    for (int i=0;i<arr.length;i++){
                        arr[i][0]=0;
                    }
                }
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
            System.out.println("Given matrix is");
            Print2DArray(matrix);
            setmatrix(matrix);
            System.out.println("Seted matrix is");
            Print2DArray(matrix);
        }
    }
