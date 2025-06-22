package ARRAY2D;

import java.util.Scanner;

public class ARRAY2DADD {
    static void Print2DArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

    static void add(int[][] a, int r1, int c1, int[][] b, int r2, int c2) {
        if (r1 != r2 && c1 != c2) {
            System.out.println("Addition Is Not Possible Please Enter Correct Dimension");
            return;
        }
        int[][] sum = new int[r1][c1];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("Addition of Matrix 1 & 2 is");
        Print2DArray(sum);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Rows Of Matrix a");
        int r1 = sc.nextInt();
        System.out.println("Enter The Columns Of Matrix a");
        int c1 = sc.nextInt();
        int [] [] a = new int[r1][c1];
        System.out.println("Enter the "+ r1 * c1 + " Elements of Matrix a");
        for (int i=0;i<r1;i++){
            for (int j=0;j<c1;j++){
                a[i][j]= sc.nextInt();
            }
        }
        System.out.println("Enter The Rows Of Matrix b");
        int r2 = sc.nextInt();
        System.out.println("Enter The Columns Of Matrix b ");
        int c2 = sc.nextInt();
        int [] [] b = new int [r2] [c2];
        System.out.println("Enter The "+ r2 * c2 + " Elements Of Matrix b ");
        for (int i=0;i<r2;i++){
            for (int j=0;j<c2;j++){
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix a is ");
        Print2DArray(a);
        System.out.println("Matrix b is ");
        Print2DArray(b);
        add(a,r1,c1,b,r2,c2);
    }
}
