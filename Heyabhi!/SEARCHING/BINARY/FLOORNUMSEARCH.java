package SEARCHING.BINARY;

public class FLOORNUMSEARCH {
    /*
    Floor Number Is Greater Number Smaller Or Is  Equal to Target
    Input = [2,3,5,9,14,16,18] , Target=15
    Output = 14
    Input = [1,12,23,34,45,56,67] , Target=66
    Output = 56
     */

    static int Floorsearch(int [] arr,int target){
        int start=0,end=arr.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if (target<arr[mid])
                end=mid-1;
            else if (target>arr[mid])
                start=mid+1;
            if (target==arr[mid])
                return mid;
        }
        return end;
    }

    public static void main(String[] args) {
        int [] arr={2,3,5,9,14,16,18};
        int target=18;
        int ans=Floorsearch(arr,target);
        System.out.println(ans);
    }
}
