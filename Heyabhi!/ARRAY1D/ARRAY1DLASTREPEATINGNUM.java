package ARRAY1D;

import java.util.Scanner;

class ARRAY1DLASTREPEATINGNUM {
    static int lastrepeat(int [] arr){
        int n= arr.length;
        for (int i=n;i>0;i--){
            for (int j=i+1;j<n;j++){
                if (arr[i]==arr[j]){
                    return arr[i];
                }
            }
        }


        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int size = sc.nextInt();
        System.out.println("Enter the"+" "+size+" "+"Elements in array");
        int [] arr = new int [size];
        for (int i = 0 ; i < arr.length ; i++){
            arr [i] = sc.nextInt();
        }
        System.out.println("The Last Element Repeated Is:"+lastrepeat(arr));


    }

}