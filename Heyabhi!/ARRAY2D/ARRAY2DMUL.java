package ARRAY2D;

import java.util.Scanner;

public class ARRAY2DMUL {
    static void PrintTwoDArray( int [] [] arr){
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void Multiply(int [] [] a, int r1, int c1 , int [] [] b, int r2, int c2){
        if (c1!=r2){
            System.out.println("Multiplication is Not Possible");
            return;
        }
        int [] [] mul = new int [r1] [c2];
        for (int i=0;i<r1;i++){
            for (int j=0;j<c2;j++){
                for (int k=0;k<r2;k++){
                    mul[i][j]+=a[i][k]*b[k][j];
                }
            }
        }
        PrintTwoDArray(mul);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the rows of matrix a");
        int r1= sc.nextInt();
        System.out.println("Enter the columns of matrix a");
        int c1= sc.nextInt();
        System.out.println("Enter the value of Matrix a"+ r1*c1);
        int [] [] a= new int[r1][c1];
        for (int i=0;i<r1;i++){
            for (int j=0;j<c1;j++){
                a[i][j]= sc.nextInt();
            }
        }
        System.out.println("Enter the rows of matrix b");
        int r2=sc.nextInt();
        System.out.println("Enter the columns of matrix b");
        int c2 = sc.nextInt();
        System.out.println("Enter the values of matrix b"+r2*c2);
        int [] [] b = new int[r2][c2];
        for (int i=0;i<r2;i++){
            for (int j=0;j<c2;j++){
                b[i][j]= sc.nextInt();
            }
        }
        System.out.println("Matrix a is:");
        PrintTwoDArray(a);
        System.out.println("Matrix b is:");
        PrintTwoDArray(b);
        System.out.println("Multiplication of Matrix a and b is:");
        Multiply(a,r1,c1,b,r2,c2);
    }
}