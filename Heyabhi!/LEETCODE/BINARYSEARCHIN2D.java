package LEETCODE;

import java.util.Arrays;

public class BINARYSEARCHIN2D {
    public static void main(String[] args) {
        int [] [] arr={
                { 1, 3, 5, 7},
                { 10, 11, 16, 20},
                { 23, 30, 34, 60}
        };
        int target=11;
        System.out.println(Arrays.toString(targetsearch(arr,target)));
    }
    static int [] binary(int [] [] arr,int target,int row,int cstart,int cend){
        while (cstart<=cend){
            int mid=cstart+(cend-cstart)/2;
            if (target==arr[row][mid]){
                return new int[]{row,mid};
            }
            else if (target<arr[row][mid]){
                cend=mid-1;
            }
            else cstart=mid+1;
        }
        return new int[]{};
    }
    static int [] targetsearch(int [] [] arr, int target){
        int row=arr.length;
        int col=arr[0].length;
        if (row==1){
            binary(arr,target,0,0,col-1);
        }
        int rstart=0;
        int rend=row-1;
        int cmid=col/2;

        while (rstart<=rend){
            int mid=rstart+(rend-rstart)/2;
            if (target==arr[mid][cmid]){
                return new int[]{mid,cmid};
            } else if (target<arr[mid][cmid]) {
                rend=mid-1;

            }
            else rstart=mid+1;
        }
        if (target==arr[rstart][cmid]){
            return new int [] {rstart,cmid};
        }
        if (target<arr[rstart][cmid]){
           return binary(arr,target,rstart,0,cmid-1);

        }
        if (target>arr[rstart][cmid] && target <arr[rstart][col-1]){
            return binary(arr,target,rstart,cmid+1,col-1);

        }
        return new int[]{};
    }
}
