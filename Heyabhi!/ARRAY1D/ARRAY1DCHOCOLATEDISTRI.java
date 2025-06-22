package ARRAY1D;

import java.util.Arrays;
import java.util.Scanner;

public class ARRAY1DCHOCOLATEDISTRI {
    public static int Mindiffernce(int [] arr,int m){
         int Mindif=Integer.MAX_VALUE;
        Arrays.sort(arr);
        for (int i=0;i+m-1<arr.length;i++){
            int diff=arr[i+m-1]-arr[i];
            if (diff<Mindif)
                Mindif=diff;

        }
        return Mindif;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of student");
        int m= sc.nextInt();
        System.out.println("Enter the size of array");
        int n=sc.nextInt();

        int [] arr=new int[n];
        System.out.println("enter the "+n+" elements in array");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Minimum Difference is : "+Mindiffernce(arr,m));

    }
}
