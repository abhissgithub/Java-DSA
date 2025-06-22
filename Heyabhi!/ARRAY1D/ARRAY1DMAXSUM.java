package ARRAY1D;//
// ****** KADANE'S ALGORITHM ***********

import java.util.Scanner;

public class ARRAY1DMAXSUM {
    static void printarray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    static int sumofarr(int[] arr) {
        int sum = 0, totsum = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            totsum = Math.max(sum, totsum);
            if (sum < 0)
                sum = 0;
        }
        return totsum;

    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of arrray");
        int size= sc.nextInt();
        int [] arr = new int[size];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("sum of array is "+sumofarr(arr));

    }


    }