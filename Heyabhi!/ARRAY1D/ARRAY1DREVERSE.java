package ARRAY1D;

import java.util.Scanner;

class ARRAY1DREVERSE {
    static void Printarray(int [] arr){
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println();

    }
    static int [] reversearray(int [] arr){
        int n=arr.length;
        int j=0;
        int [] ans = new int[n];
        for (int i=n-1;i>=0;i--){
            ans[j++]=arr[i];
        }

        return ans;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n= sc.nextInt();
        int [] arr=new int[n];
        System.out.println("Enters the elements in array");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        // int [] arr={1,2,3,4,5,6,7,8,9};
        //        int [] ans=reversearray(arr);
        //        Printarray(ans)
        System.out.println("Reverse array is");
        int [] ans=reversearray(arr);
        Printarray(ans);
    }
}