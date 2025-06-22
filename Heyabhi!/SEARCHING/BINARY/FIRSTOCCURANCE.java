package SEARCHING.BINARY;

public class FIRSTOCCURANCE {
    static int search(int [] arr , int target) {
        int ans=-1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target==arr[mid]){
                ans=mid;
                end=mid-1;
            } else if (target < arr[mid]){

                end = mid - 1;
            }
            else {
                start = mid + 1;
            }

        }
        return ans;

    }


    public static void main(String[] args) {
        int [] arr={1,5,5,5,5,};
        int target=5;
        System.out.println(search(arr,target));
    }

}
