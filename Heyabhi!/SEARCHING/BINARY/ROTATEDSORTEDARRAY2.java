package SEARCHING.BINARY;

public class ROTATEDSORTEDARRAY2 {
    //    FOR Duplicate Numbers
//    arr=[2,2,2,2,9];
//    Rotated Twice !
//    arr=[2,9,2,2,2];
    static int pivot(int[] arr) {
        int start = 1;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid]==1){
                return arr[mid];
            }
            if (arr[mid] > arr[mid + 1]) {
                return arr[mid];
            }
            if (arr[mid] < arr[mid - 1]) {
                return arr[mid - 1];
            }
            if (arr[start] == arr[mid] || arr[mid] == arr[end] && arr[start] == arr[end]) {
                if (arr[start] >= arr[start + 1]) {
                    return arr[start];
                }
                start++;
                if (arr[end] < arr[end - 1]) {
                    return arr[end - 1];
                }
                end--;
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr={1,3,4,2,2};
        int target=2;
        System.out.println(search(arr,target));
    }
//    NOW WRITE THE REMAINING CODE OF ROTATEDSORTEDARRAY
static int search(int[] arr, int target) {
    int pivot=pivot(arr);
    if(pivot==-1){
        return binary(arr,target,0,arr.length-1);
    }
    if(arr[pivot]==target){
        return pivot;
    }
    if(target>=arr[0]){
        return binary(arr,target,0,pivot-1);
    }
    return binary(arr,target,pivot+1,arr.length-1);

}
    static int binary(int [] arr,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>target){
                end=mid-1;
            }
            else if(arr[mid]<target){
                start=mid+1;

            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
