package SLIDINGWINDOW;

import java.util.Scanner;

public class MAXSUMSUBARRAY {

//    Sub-array must be continuous
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Size of Array");
    int n=sc.nextInt();
    int [] arr=new int[n];
    System.out.println("Enter element");
    for (int i=0;i<n;i++){
        arr[i]= sc.nextInt();
    }
    System.out.println("enter size of window");
    int k=sc.nextInt();

    System.out.println("Maximum sum is: " + maxsum(arr,n,k));

}
public static int maxsum(int [] arr,int n,int k){
    int i=0,j=0;
    int sum=0;
    int mx=0;
    while (j<n){
        sum=sum+arr[j];

        if (j-i+1==k){
            mx=Math.max(mx,sum);
            sum=sum-arr[i];
            i++;
        }
        j++;
    }
    return mx;
}
}
