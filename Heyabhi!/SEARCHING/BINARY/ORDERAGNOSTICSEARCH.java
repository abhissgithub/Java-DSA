package SEARCHING.BINARY;

public class ORDERAGNOSTICSEARCH {
    public static void main(String[] args) {
        int [] arr={1,2,54 ,68,78,75};
        int target=1;
        int ans=OrderAgno(arr,target);
        System.out.println(ans);

    }
    static int OrderAgno(int [] arr, int target){
        int start=0, end=arr.length-1;
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
}
