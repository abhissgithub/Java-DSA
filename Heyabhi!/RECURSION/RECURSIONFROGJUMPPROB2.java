package RECURSION;

public class RECURSIONFROGJUMPPROB2 {
static int frogjump(int [] arr,int n,int idx){
    n=arr.length;

    // Base case
    if (idx==n-1) return 0;

    // Recursive work

    // if frog want to jump on 1st stone
    int opt1=frogjump(arr,n,idx+1)+Math.abs(arr[idx]-arr[idx+1]);

    // If frog is on (n-2) then he must have to jump on (n-1) stone i.e he must choose opt1
    if (idx==n-2) return opt1;

    // if frog want to jump on 2nd stone
    int opt2=frogjump(arr,n,idx+2)+Math.abs(arr[idx]-arr[idx+2]);

    // then we return the min incurred cost b/w two path
    return Math.min(opt1,opt2);
}
public static void main(String[] args) {
        int[]arr={10,30,40,20};
        System.out.println(frogjump(arr,arr.length,0));
    }
}
