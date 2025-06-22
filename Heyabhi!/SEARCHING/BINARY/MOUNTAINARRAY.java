package SEARCHING.BINARY;

public class MOUNTAINARRAY {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,3,1};
        int target = 3;
        System.out.println(search(arr,target));

    }

    static int findInMountainArray(int[] arr) {
        int start = 0, end = arr.length - 1;
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1;
            } else if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else return mid;
        return start;
    }
    static int OrderAgno(int [] arr, int target,int start,int end){
        boolean IsAsci=arr[start]<arr[end];
        while (start<=end){
            int mid=start+(end-start)/2;
            if (target==arr[mid])
                return mid;
            if (IsAsci){
                if (target<arr[mid])
                    end=mid-1;
                else start=mid+1;
            }
            else {
                if(target<arr[mid])
                    end=mid-1;
                else start=mid+1;
            }

        }
        return -1;
    }
    static int search(int [] arr,int target){
        int peakk=findInMountainArray(arr);
        int first=OrderAgno(arr,target,0,peakk);
        if (first!=-1){
            return  first;
        }
        else return OrderAgno(arr,target,peakk+1,arr.length-1);
    }
}
