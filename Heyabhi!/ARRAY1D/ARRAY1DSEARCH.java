package ARRAY1D;

import java.util.Scanner;

class ARRAY1DSEARCH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows");
        int rows = sc.nextInt();
        System.out.println("enter number of columns");
        int colms = sc.nextInt();
        //input
        //rows
        int[][] num = new int[rows][colms];
        for (int i = 0; i < rows; i++) {
            //columns
            for (int j = 0; j < colms; j++) {
                System.out.println("enter no for place" + i + " " + j);
                num[i][j] = sc.nextInt();
            }
        }
       System.out.println("enter no to find");
        int x=sc.nextInt();
        for (int i=0;i<rows;i++)
            for (int j=0;j<colms;j++){
                if (num[i][j]==x){
                    System.out.println("x found at location"+i+ " "+j);
                }
                else {
                    System.out.println("num not found"+i+ " "+j);
                    break;
                }
            }
    }
}
