package RECURSION;

import java.util.Scanner;

public class RECURSIONONISTARGETFIND {
    static boolean istarget(int [] arr, int n, int target,int idx){
        if (idx>n){
            return false;
        }
        if (arr[idx]==target){
            return true;
        }
        return istarget(arr,n,target,idx+1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("target");
        int target= sc.nextInt();
        System.out.println(istarget(arr,n,target,0));
    }
}
