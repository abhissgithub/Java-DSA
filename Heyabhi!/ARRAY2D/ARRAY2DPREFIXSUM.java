package ARRAY2D;

import java.util.Scanner;

public class ARRAY2DPREFIXSUM {
    static void Print2DArray(int[][] arr) {    //for printing 2d array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    // FOR SUM OF MATRIX
    static void Prefsum(int[][] arr) {
//        1 2 3 4
//        5 6 7 8
//        9 5 4 3

        int r = arr.length;  // length of array is equal to no.of rows of array (look above matrix)
        // if(r>0)
        int c = arr[0].length; // for declaring column in each row.

        // FOR HORIZONTAL SUM ( ROW WISE SUM )

        for (int i = 0; i < r; i++) {
            for (int j = 1; j < c; j++) {
                arr[i][j] += arr[i][j - 1];

                // after row wise summation array will be

                // 1 3 6 10
                // 5 11 18 26
                // 9 14 18 21

            }
        }
        // FOR VERTICAL SUM ( COLUMN WISE SUM )
        for (int j=0;j<c;j++) {
            for (int i = 1; i < r; i++) {
                arr[i][j] += arr[i - 1][j];
            }
        }
            // after column wise summation array will be
            // 1 3 6 10
            // 6 14 24 36
            // 15 28 42 57           // look first array and summation up to arr[r2][c2] is 57.

    }
    public static int Prefsum2(int [] [] arr,int r1, int c1, int r2, int c2){
        Prefsum(arr);
        int ans=0;int sum=0;int up=0;int left=0;int upleft=0;
        sum=arr[r2][c2];
        if (r1>0) {
            up = arr[r1 - 1][c2];
        }
        if (c1>0) {
            left = arr[r2][c1 - 1];
        }
        if (r1 >0 && c1>0) {
            upleft = arr[r1 - 1][c1 - 1];
        }
        ans=sum-up-left+upleft;
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of rows and columns of matrix a");
        int r= sc.nextInt();
        int c= sc.nextInt();
        int [][]arr=new int[r][c];
        int totalelement=r*c;
        System.out.println("Enter "+totalelement + " values");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                arr[i][j]= sc.nextInt();
            }
        }
        System.out.println("Given matrix is");
        Print2DArray(arr);
        System.out.println("Enter boundries");
        int r1=sc.nextInt();
        int c1=sc.nextInt();
        int r2= sc.nextInt();;
        int c2=sc.nextInt();
        System.out.println("Total sum is: "+Prefsum2(arr,r1,c1,r2,c2));
    }
}

