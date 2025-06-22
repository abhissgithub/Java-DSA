package LEETCODE;

public class SEARCHIN2D {
    public static boolean search(int [] [] arr,int target){
        int row=arr.length;
        int col=arr[0].length;
        int start=0;
        int end=row*col-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            int mide=arr[mid/col][mid%col];
            if (mide==target) return true;
            if (target<mide)
                end=mid-1;
            else start=mid+1;
        }
        return false;
    }

    public static void main(String[] args) {
        int [] [] arr={
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}
        };
        int target=3;
        System.out.println(search(arr,target));
    }
}
