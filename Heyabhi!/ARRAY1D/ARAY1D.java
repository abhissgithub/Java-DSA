package ARRAY1D;

import java.util.Scanner;

public class ARAY1D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i]= sc.nextInt();



        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }
}