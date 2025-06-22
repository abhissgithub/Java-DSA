package SEARCHING.BINARY;

public class RECURSIONONBINARY {
    static int recursearch(int [] arr,int target,int start,int end){

//        Base Case
        if (start>end){
            return -1;
        }

        int mid=start+(end-start)/2;
        if (target==arr[mid]){
            return mid;
        }
        else if (target<arr[mid]){
           return recursearch(arr,target,start,mid-1);
        }
        else {

            return recursearch(arr,target,mid+1,end);
        }
    }

    public static void main(String[] args) {
        int [] arr={12,45,67,89,99};
        int target=67;
        System.out.println("Index of target is "+recursearch(arr,target,0,arr.length-1));
    }


}
