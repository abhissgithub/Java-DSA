package ARRAY1D;

import java.util.Scanner;

class ARRAY1D2NDSMALLNUM {
    static int largenum(int [] arr){
        int max=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    static int secondlarge(int [] arr){
        int max=largenum(arr);
        for (int i=0;i<arr.length;i++){
            if (arr[i]==max){
                arr[i]=Integer.MIN_VALUE;
            }



        }
        int smallnum=largenum(arr);
        return smallnum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of arrray");
        int size= sc.nextInt();
        System.out.println("Enter the elements in array");
        int [] arr = new int[size];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
        System.out.println("second last num is"+secondlarge(arr));
    }
}