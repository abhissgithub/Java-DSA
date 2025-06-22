package ARRAY1D;

import java.util.Scanner;

public class ARRAY1DSMALLNUM
{
    static  int small(int [] arr)
    {
        int min=Integer.MAX_VALUE;
        int n= arr.length;
        for (int i=0;i<n;i++)
        {
            if (arr[i]<min )
            {
                min=arr[i];
            }
        }
        return min;
    }
    static int secondsmall(int [] arr){
        int min=small(arr);
        for (int i=0;i<arr.length;i++){
            if (arr[i]==min){
                arr[i]=Integer.MAX_VALUE;
            }
        }
        int ssecondsmall=small(arr);
        return ssecondsmall;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size of array");
        int N = sc.nextInt();
        System.out.println("Enter"+" "+ N +" elements in array");
        int [] arr = new int [N];
        for (int i=0;i<arr.length;i++)
        {
            arr[i]= sc.nextInt();
        }
        System.out.println("Smallest Num is:"+""+small(arr));
        System.out.println("Second Smallest Num is:"+""+secondsmall(arr));
    }
}
