package SORTING;

import java.util.Arrays;
import java.util.SortedMap;

public class RADIXSORT {
    static int maxnum(int [] arr){
        int max=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }

        }
        return max;
    }
    static void count(int [] arr, int place){  // 802 597 009 200 007 -----(0)
        int n=arr.length;
        int [] ans=new int[n];
//        int max=maxnum(arr);
        int [] count=new int[10];
        for (int i=0;i<arr.length;i++){
            count[(arr[i]/place)%10]++;    // 2 7 9 0 7  <----- Here We Count digit at one's place of element from(0)
                                          //  0 1 2 3 4
        }
        for (int i=1;i<count.length;i++){
            count[i]+=count[i-1];         // 2 9 18 18 25 <---- We Make Prefix sum of digits
                                         //  0 1  2  3  4
        }
        for (int i=n-1;i>=0;i--) {        //<------Traverse from backward and put the nums at his position
            int indx=count[(arr[i]/place)%10]-1;  //<---- indx is for ans array
            ans[indx]=arr[i];
            count[(arr[i]/place)%10]--;   // As We put nums at his correct position prefix sum will be - for another ind
        }
        for (int i=0;i<n;i++){
            arr[i]=ans[i];   //We copy the elements from array to put in ans array
        }

    }
    static void radixsort(int [] arr){
        int max=maxnum(arr);
        for (int place=1;max/place>0;place*=10){   // for one's/tenth's/hundred's position of digit
            count(arr,place);

        }
    }

    public static void main(String[] args) {
        int[] arr = {802, 597, 9, 200, 80};
        System.out.println("Array before Sorting :"+ Arrays.toString(arr));
        radixsort(arr);
        System.out.println("Arrays after sorting :"+Arrays.toString(arr));
    }

}
