package ARRAY2D;// GENERATE SPIRAL ARRAY
import java.util.Scanner;

public class ARRAY2DSPIRALMATRXGENERTN {
        static void Print2DArray(int [] [] arr) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr [i] [j]+ " ");
                }
                System.out.println();
            }


        }

        static int [][] Spiral(int n) {

            int [] [] arr=new int[n][n];

            int toprow = 0, bottomrow = n - 1;
            int leftcol=0, rightcol= n-1;
            int count =1;
            while (count<n*n){
                // Toprow == leftcol to rightcol
                for (int j=leftcol;j<=rightcol && count<=n*n;j++){
                    arr[toprow][j]=count++;
                }
                toprow++;
                // Rightcol= toprow to Bottomrow
                for (int i=toprow;i<=bottomrow && count<=n*n;i++){
                    arr[i][rightcol]=count++;
                }
                rightcol--;
                // Bottomrow = rightcol to leftcol
                for (int j = rightcol; j>=leftcol && count<=n*n;j--){
                    arr[bottomrow][j]=count++;
                }
                bottomrow--;
                // Leftcolm = Bottomrow to topRow
                for (int i=bottomrow;i>=toprow && count<=n*n;i--){
                    arr[i][leftcol]=count++;
                }
                leftcol++;

            }
            return arr;

        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter rows and columns of matrix");
            int n= sc.nextInt();
            int [] [] matrix =Spiral(n);
//            System.out.println("Enter the " +n*n+ " Elements of matrix");
            Print2DArray(matrix);
//            for (int i=0;i<n;i++){
//                for (int j=0;j<n;j++){
//                    matrix[i][j]= sc.nextInt();
//
//                }
//            }
//
//            System.out.println(" Given matrix is");
//            Print2DArray(matrix);
//
//            System.out.println("Spiral Matrix is");
//            Print2DArray(Spiral(n));



        }


    }
