package LEETCODE;

import java.util.Scanner;

public class SPIRALGENERATEMATRX {
    static void Print2DArray(int [] [] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr [i] [j]+ " ");
            }
            System.out.println();
        }


    }

    static int[][] spiral(int n) {
        int[][] arr = new int[n][n];

        int toprow = 0, bottomrow = n - 1;
        int leftcol = 0, rightcol = n - 1;
        int count = 1;
        while (count<n*n) {
            //            toprow=leftcol-->rightcol;
            for (int j = leftcol; j <= rightcol && count <=n * n; j++) {
                arr[toprow][j]= count++;
            }
            toprow++;
//            rightcol=toprow-->bottomrow;
            for (int i = toprow; i <= bottomrow && count <= n * n; i++) {
                arr[i][rightcol]=count++;
            }
            rightcol--;
//            bottomrow=rightcol-->leftcol;
            for (int j=rightcol;j>=leftcol && count<=n*n;j--){
                arr[bottomrow][j]=count++;
            }
            bottomrow--;
//            leftcol==bottomrow-->toprow;
            for (int i = bottomrow; i >= toprow && count <= n * n; i--) {
                arr[i][leftcol]=count++;
            }
            leftcol++;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and columns of matrix");
        int n = sc.nextInt();
        int[][] matrix = spiral(n);
        Print2DArray(matrix);

    }
}
