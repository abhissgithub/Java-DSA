package LEETCODE;

import java.util.Scanner;

public class SPIRALMATRIXTRAVERSE {
    static void print2darray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print( arr [i] [j] + " ");
            }
            System.out.println();
        }

    }

    static void spiral(int[][] arr, int r, int c) {
        int toprow = 0, bottomrow = r - 1;
        int leftcolumn = 0, rightcolumn = c - 1;
        int toatlelements = 0;

        while (toatlelements < r*c) {
            //          toprow==leftcolumn-->rightcolumn
            for (int j = leftcolumn; j <= rightcolumn && toatlelements < r * c; j++) {
                System.out.print(arr[toprow][j]+" ");
                toatlelements++;
            }
            toprow++;

//            rightcolumn==toprow-->bottomrow
            for (int i = toprow; i <=bottomrow && toatlelements < r * c; i++) {
                System.out.print(arr[i][rightcolumn]+" ");
                toatlelements++;
            }
            rightcolumn--;

//            bottomrow==rightcolumn-->leftcolumn
            for (int j = rightcolumn; j >= leftcolumn && toatlelements < r * c; j--) {
                System.out.print(arr[bottomrow][j]+" ");
                toatlelements++;
            }
            bottomrow--;

//            leftcolumn==bottomrow-->toprow
            for (int i = bottomrow; i >= toprow && toatlelements < r * c; i--) {
                System.out.print(arr[i][leftcolumn] +" ");
                toatlelements++;
            }
            leftcolumn--;

        }

    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the no. of rows and colunmns");
        int r= sc.nextInt();
        int c=sc.nextInt();
        System.out.println("Total"+r*c+"Values");
        int [][] arr=new int[r][c];
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        System.out.println("Given array is");
        print2darray(arr);
        System.out.println("spiral matrix is");
        spiral(arr,r,c);
    }
}
