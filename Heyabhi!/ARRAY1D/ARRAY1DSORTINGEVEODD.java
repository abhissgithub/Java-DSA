package ARRAY1D;

import java.util.Scanner;

public class ARRAY1DSORTINGEVEODD {
    public static void swap( int [] arr,int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void printarray(int [] arr){
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void sortevenodd(int [] arr){
        int n=arr.length;
        int left=0;
        int right=n-1;
        while (left<right){
            if ( arr[left]%2!=0 && arr[right]%2==0){
                swap(arr,left,right);
            }
            if (arr[left]%2==0){
                left++;
            }
            if (arr[right]%2!=0){
                right--;

            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of Array");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enter the"+n+"Elements in array");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Origial Elements in array");
        printarray(arr);
        sortevenodd(arr);
        System.out.println("Sorted Elements In array");
        printarray(arr);
    }

}
