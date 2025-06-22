package SEARCHING.BINARY;
//[5,3,1,2,4]
public class CHOCOLATEDISTRIBUTION {
    static int Distribution(int [] arr, int m){
        if (arr.length<m) return -1;
        int ans=0;
        int start=0;
        int end=(int) 1e9;
        while (start<=end){
            int mid=start+(end-start)/2;
            if (isdivisionpossible(arr,m,mid)){
                ans =mid;
                end=mid-1;
            }
            else start=mid+1;

        }
        return ans;
    }
    static boolean isdivisionpossible(int [] arr , int m, int maxchoco){
        int noofstu=1;
        int noofchoco=0;
        for (int i=0;i<arr.length;i++){
        if (maxchoco<arr[i]){
            return false;
        }
        if (noofchoco+arr[i]<=maxchoco){
            noofchoco=noofchoco+arr[i];
        }
        else {
            noofstu++;
            noofchoco=arr[i];
        }

        }
        return noofstu<=m;
    }

    public static void main(String[] args) {
        int [] arr={3,2,2,4,1,4};
        int m=3;
        System.out.println(Distribution(arr,m));
    }
}
