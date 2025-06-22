package SORTING;

import java.util.Arrays;

public class COUNTSORTSTABLE {
    static int maxnum(int [] arr){
        int max=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max) max=arr[i];
        }
        return max;
    }
    static int countsort(int [] arr){  // 1 2 3 2 3 1 2 -----(0)
        int n=arr.length;
        int [] ans=new int[n];
        int max=maxnum(arr);
        int [] count=new int[max+1];
        for (int i=0;i<arr.length;i++){ // 0 2 3 2  <--- num repeated time's ---(1)
                                       //  0 1 2 3  <---- num from (0)
            count[arr[i]]++;
        }
//        For Stable Algo we make prefix sum array of count array
        for (int i=1;i<count.length;i++){ // 0 2 5 7 ---(From 1)
                                         //  0 1 2 3
            count[i]+=count[i-1];

        }
        // Now make traverse on original array from backward(cause of stability)
        // And find index of element from prefix count array to put in original array
        for (int i=n-1;i>=0;i--){
            int indx=count[arr[i]]-1;   // -1 is for index
            ans[indx]=arr[i];
            count[arr[i]]--;
        }
        //Now we copy the elements in ans array from original array
        for (int i=0;i<n;i++){
            arr[i]=ans[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr={2,0,2,1,1,0};
        System.out.println("Array before Sorting : "+ Arrays.toString(arr));
        countsort(arr);
        System.out.println("Array after Sorting : "+ Arrays.toString(arr));


    }

}
