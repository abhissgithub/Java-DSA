package RECURSION;

import java.util.Scanner;

public class RECURSIONONARRAYFINDTARGET {
    static int findtarget(int arr[],int n, int target, int idx){
        n= arr.length;
        if (idx>=n)
            return -1;
        if (arr[idx]==target)
            return idx;
        return findtarget(arr,n,target,idx+1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
         int [] arr = new int[n];
         for (int i=0;i<n;i++){
             arr[i]=sc.nextInt();
         }
        System.out.println("Enter target");
         int target = sc.nextInt();
        System.out.println(findtarget(arr,n,target,0));
    }
}
