package SEARCHING.BINARY;
import java.util.Arrays;

public class CEILINGNUMSEARCH {
    /*
    Here Ceiling Means Smallest Elements In Array Which Is greater Than Or is equal to the Target num;
    arr=[12,23,33,45,67];
    target=23
    ans=23;

    arr=[12,45,67,89,99];
    target=78
    ans=89;

     */

    static int ceiling(int [] arr, int target){
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target>arr[mid]){
                start=mid+1;
            }
            else if(target<arr[mid]){
                end=mid-1;
            

            }
            if(arr[mid]==target){
                return mid;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int [] arr={12,23,45,48,67,68};
        int target=69;
        int ans=ceiling(arr, target);
        System.out.println("ans is "+ans);


        
    }

}
