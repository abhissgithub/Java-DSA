package RECURSION;

public class RECURSIONONARRAYSUMOFSUBSET {
    static void sumofsubset(int []arr,int n,int idx,int sum){
        n=arr.length;
        if (idx>=n) {
            System.out.println(sum);
            return;
        }
        // if want to choose
        sumofsubset(arr, n, idx+1 ,sum+arr[idx]);
        // if don't want to choose
        sumofsubset(arr, n, idx+1, sum);
    }

    public static void main(String[] args) {
        int [] arr ={2,4,5};
        sumofsubset(arr,arr.length,0,0);
    }
}
