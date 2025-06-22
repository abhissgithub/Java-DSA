package SEARCHING.BINARY;

import javax.imageio.stream.ImageInputStream;
import java.util.Arrays;
/*
Facebook Interview Question
input =[1,2,2,3,3,3,5];
target=3;
output= [3,5];
 */

public class POSITIONOFELMTSEARCH {
    static int[] position(int [] arr, int target) {
        int[] ans = {-1, -1};
       int start= search(arr,target,true);
        int end=search(arr,target,false);
        ans[0]=start;
        ans[1]=end;
        return ans;
    }
   static int search(int [] arr, int target,boolean firstindex){
        int ans=-1;
        int start=0;
        int end=arr.length-1;
        while (start<=end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid])
                end = mid - 1;
            else if (target > arr[mid]) {
                start = mid + 1;


            } else {
                ans = mid;
                if (firstindex) {
                    end = mid - 1;
                }
                else start=mid+1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int [] arr={7,7,8,8,10};
        int target=8;
        int ans[]=position(arr,target);
        System.out.println(Arrays.toString(ans));

    }
}

