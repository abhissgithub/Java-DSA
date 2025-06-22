package SEARCHING.BINARY;

public class LASTOCCURANCE {
    static int lastposition(int[] arr, int target) {
        int ans = -1;
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                ans = mid;
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            } else start = mid + 1;

        }
        return ans;
    }

    public static void main(String[] args) {
        int [] arr={1,2,3,4,4,4,4,5};
        int target=4;
        System.out.println(lastposition(arr,target));
    }
}
