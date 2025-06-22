package ARRAY1D;

import java.util.Scanner;

class Array1DNEXTPERMUTATION{
    static void printarry(int [] arr){
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void NextPermutation(int [] arr) {
        int indx1 = -1;
        int indx2 = -1;
        int n = arr.length;
        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] < arr[i + 1]) {
                indx1 = i;
                break;
            }
        }
        if (indx1 == -1) {
            reverse(arr, 0,n);
        } else {
            for (int i = n - 1; i > 0; i--) {
                if (arr[indx1] < arr[i]) {
                    indx2 = i;
                    break;
                }
            }
                swap(arr, indx1, indx2);
                reverse(arr, indx1+1,n);
        }

    }
static void swap(int arr [],int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

}
static void reverse(int arr[],int i, int j){
       i=0;
       j=arr.length-1;
        while (i<j) {
            swap(arr, i, j);
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n= sc.nextInt();
        int [] arr ={1,2,3,4};
        printarry(arr);
        NextPermutation(arr);


    }
}