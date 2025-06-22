package SEARCHING.BINARY;

import java.lang.reflect.Array;
import java.util.Arrays;

class FIRSTANDLASTPOS{
    static int search(int [] arr,int target,boolean isfirstindx){
        int ans=-1;
        int start=0,end=arr.length-1;
        while (start<=end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid])
                end = mid - 1;
            else if (target > arr[mid]) {
                start = mid+ 1;

            } else {
                ans = mid;
                if (isfirstindx) {
                    end = mid - 1;
                } else start = mid + 1;

            }
        }
        return ans;
    }
    static int[] position(int[]arr, int target){
        int [] ans={-1,-1};
        ans[0]=search(arr,target,true);
        ans[1]=search(arr,target,false);
        return ans;
    }

    public static void main(String[] args) {
        int [] arr={1,3,3,3,4};
        int taget=3;
        position(arr,taget);
        int [] ans=position(arr,taget);
        System.out.println(Arrays.toString(ans));
    }
}