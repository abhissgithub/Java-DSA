package ARRAY1D;

import java.util.Scanner;

class ARRAY1DSECONDLARGEST {
    static int firstmax( int [] arr) {
        int max=Integer.MIN_VALUE;
        int n=arr.length;
        for (int i=0;i<n;i++){
                if (arr[i]>max) {
                    max=arr[i];
                }
        }
        return max;
    }
    static int secondmax(int[]arr) {
        int max=firstmax(arr);
        for (int i=0;i<arr.length;i++){
            if (arr[i]==max) {
                arr[i]=Integer.MIN_VALUE;
            }
        }
        int Mx=firstmax(arr);
        return Mx;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Ennter size");
        int size= sc.nextInt();
        int [] arr = new int[size];
        System.out.println("Enter elements");
        for (int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }


        System.out.println("Second max elements iz:"+secondmax(arr));

    }
}