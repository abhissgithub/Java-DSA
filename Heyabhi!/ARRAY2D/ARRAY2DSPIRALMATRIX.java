package ARRAY2D;

import java.util.Scanner;

//SPIRAL MATRIX :
//
//
//
//
public class ARRAY2DSPIRALMATRIX {
    static void Print2DArray(int [] [] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr [i] [j]+ " ");
            }
            System.out.println();
        }


    }

    static void Spiral(int [] [] arr,int r,int c) {

        int toprow = 0, bottomrow = r - 1;
        int leftcol=0, rightcol= c-1;
        int totalelements=0;
        while (totalelements <  r*c){
            // Toprow == leftcol to rightcol
            for (int j=leftcol;j<=rightcol  && totalelements<r*c;j++){
                System.out.println(arr[toprow][j]+" ");
                totalelements++;

            }
            toprow++;
            // Rightcol= toprow to Bottomrow
            for (int i=toprow;i<=bottomrow && totalelements<r*c;i++){
                System.out.println(arr[i][rightcol]+" ");
                totalelements++;
            }
            rightcol--;
            // Bottomrow = rightcol to leftcol
            for (int j = rightcol; j>=leftcol && totalelements<r*c;j--){
                System.out.println(arr[bottomrow][j]+" ");
                totalelements++;
            }
            bottomrow--;
           // Leftcolm = Bottomrow to topRow
            for (int i=bottomrow;i>=toprow && totalelements<r*c;i--){
                System.out.println(arr[i][leftcol]+" ");
                totalelements++;
            }
            leftcol++;

        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and columns of matrix");
        int r= sc.nextInt();
        int c = sc.nextInt();
        int [] [] matrix =new int [r][c];
        System.out.println("Enter the " +r*c+ " Elements of matrix");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                matrix[i][j]= sc.nextInt();

            }
        }
        System.out.println(" Given matrix is");
        Print2DArray(matrix);
        System.out.println("Spiral Matrix is");
        Spiral(matrix,r,c);


    }


}
