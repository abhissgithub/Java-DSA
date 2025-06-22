package ARRAY2D;

import java.util.Scanner;

public class ARRAY2DPREFIXSUMM {
    static void Print2DArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void prefsum(int[][] arr) {
        int r = arr.length;
        int c = arr[0].length;
        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                arr[i][j] += arr[i][j - 1];

            }
        }
    }

    static int findsum(int[][] arr, int r1, int c1, int r2, int c2) {
        int sum = 0;
        prefsum(arr);
        for (int i = r1; i <= r2; i++) {
            if (c1 >= 1)
                sum += arr[i][c2] - arr[i][c1 - 1];
            else
                sum += arr[i][c2];


        }
        return sum;
    }

        public static void main (String[]args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter rows and columns of matrix");
            int r = sc.nextInt();
            int c = sc.nextInt();
            int[][] arr = new int[r][c];
            System.out.println("Enter the " + r * c + " Elements of matrix");
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    arr[i][j] = sc.nextInt();

                }

            }
            System.out.println("The Given Matrix is");
            Print2DArray(arr);
            System.out.println("Enter boundaries For Calculating sum ");
            int r1 = sc.nextInt();
            int c1 = sc.nextInt();
            int r2 = sc.nextInt();
            int c2 = sc.nextInt();
            System.out.println("Sum of rectangle is: " + findsum(arr, r1, c1, r2, c2));
        }
    }
