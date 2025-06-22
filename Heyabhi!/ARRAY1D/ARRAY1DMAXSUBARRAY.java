package ARRAY1D;

import java.util.Scanner;

public class ARRAY1DMAXSUBARRAY {
    public static int bruteforce(int [] arr){
        int currsum=0,  Maxsum=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            for (int j=i;j<arr.length;j++){
                currsum=+arr[i];
                Maxsum=Math.max(Maxsum,currsum);
                
            }
        }

        return Maxsum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("enter the "+n+" elements in array");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(bruteforce(arr));

    }
}
