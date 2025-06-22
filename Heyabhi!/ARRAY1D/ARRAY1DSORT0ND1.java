package ARRAY1D;

import java.util.Scanner;

public class ARRAY1DSORT0ND1 {
        public static void swap(int[] arr, int i,int j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;


        }
        public static void printarray(int [] arr){
            for (int i=0;i<arr.length;i++){
                System.out.println(arr[i]+" ");
            }

        }
        public static void sortzerotoone(int [] arr){
            int n=arr.length;
            int left=0, right=n-1;
            while (left<right){
                if (arr[left]==1 && arr[right]==0) {
                    swap(arr,left,right);
                    left++;
                    right--;
                }
                if (arr[left]==0){
                    left++;
                }
                if (arr[right]==1){
                    right--;
                }
            }
        }

        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.println("Enter the size of array");
            int size=sc.nextInt();
            int [] arr=new int[size];
            System.out.println("Enter"+size+" elemebts in array");
            for (int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            System.out.println("Original array");
            printarray(arr);
            sortzerotoone(arr);
            System.out.println("sorted array is");
            printarray(arr);
        }
    }

