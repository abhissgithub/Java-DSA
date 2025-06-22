package ARRAY1D;

import java.util.Scanner;

public class ARRAY1DSUMTIMES {
    static int sumarray(int [] arr, int x){
        int count=0;
        for (int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]+arr[j]==x){
                    count++;
                }

            }

        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = sc.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter the elements in array");
        for (int i=0;i<arr.length;i++){

            arr[i]=sc.nextInt();

        }
        System.out.println("enter the value of x");
        int x= sc.nextInt();
        System.out.println("given sum in array is following times");
        System.out.println(sumarray(arr,x));



    }
}
