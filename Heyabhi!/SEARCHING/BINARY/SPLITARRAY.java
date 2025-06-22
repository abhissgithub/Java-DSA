package SEARCHING.BINARY;

public class SPLITARRAY {
    static boolean ispossible(int [] arr,int m,int totsum){
        int currentsum=0;
        int currentm=1;
        if (currentm>m) return false;
        for (int i=0;i<arr.length;i++){
            if (totsum<arr[i]){
                return false;
            }
            if (currentsum+arr[i]<=totsum){
                currentsum=+arr[i];
            }
            else

                currentm++;
            currentsum=arr[i];
        }
        return currentm<m;
    }
    static int split(int [] arr, int m) {
        int start = 0;
        int end = (int) 1e9;
        int ans = -1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            int sum = 0;
            int pieces = 1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int [] arr={7,2,5,10,8};
        int m=2;
        System.out.println(split(arr,m));
    }
}
