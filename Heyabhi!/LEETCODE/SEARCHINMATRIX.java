package LEETCODE;

import java.util.Scanner;

public class SEARCHINMATRIX {
    static void Print2DArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static boolean search(int [][] arr,int target){

        int row=arr.length, col=arr[0].length;
        for (int i=0;i<row;i++){
            for (int j=1;j<=col;i++){
                if (arr[i][j]==target){
                    return true;
                }
            }

        }
        return false;

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
        System.out.println("ENter target");
        int target= sc.nextInt();
        System.out.println("Given matrix is");
        Print2DArray(matrix);
        search(matrix,target);
        Print2DArray(matrix);


    }
}
