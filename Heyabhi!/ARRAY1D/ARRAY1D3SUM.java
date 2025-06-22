package ARRAY1D;

import java.util.Scanner;

public class ARRAY1D3SUM {
    static int sumofarray(int [] arr, int x){
        int count=0;
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;i<arr.length;j++){
                for (int k=j+1;k<arr.length;k++){
                    if (arr[i]+arr[j]+arr[k]==x){
                        count++;

                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the " + size + " elements in array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the value of x");
        int x= sc.nextInt();
        System.out.println(sumofarray(arr,x));
    }
}
