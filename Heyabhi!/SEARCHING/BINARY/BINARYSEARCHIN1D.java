package SEARCHING.BINARY;

public class BINARYSEARCHIN1D {
    static int binary(int[] arr, int target) {
        int start = 0, end = arr.length-1;

        while (start<=end){
            int middle=start+(end-start)/2;

            /*
            Here, Integer Has Specific  Value, if we exceed that value then loop doesn't work
            because of this.
            mid=start+(end-start)/2
            ==(2start+end-start)/2
            =(start+end)/2
             */
            if (target<arr[middle]){
                end=middle-1;
            }
            else if (target>arr[middle]){
                start=middle+1;
            }
            if (target==arr[middle]){
                return middle;

            }
        }
        return -1;
    }

    public static void main(String[] args) {
            int [] arr={12,45,67,89,99};
            int target=68;
            int ans=binary(arr,target);
            System.out.println("Index of target is "+ans);

    }
}
