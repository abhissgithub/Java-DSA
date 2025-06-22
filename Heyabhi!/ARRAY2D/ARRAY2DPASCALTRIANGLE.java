package ARRAY2D;

import java.util.Scanner;

// PASCAL'S TRIANGLE
//1
//1 1
//1 2 1
//1 3 3 1
//1 4 6 4 1
//1 5 10 10 5 1
public class ARRAY2DPASCALTRIANGLE {
    static void PrintPascaltriangle(int [][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int [][] Pascal(int n){
        int [] [] ans=new int[n][];
        for (int i=0;i<n;i++){
            // ith row has i+1 columns
            ans[i]=new int[i+1];
            //First and Last Digit is 1
            ans[i][0]=ans[i][i]=1;
            for (int j=1;j<i;j++){
                ans[i][j]=ans[i-1][j]+ans[i-1][j-1];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int [] [] arr=Pascal(n);
        PrintPascaltriangle(arr);
    }
}
