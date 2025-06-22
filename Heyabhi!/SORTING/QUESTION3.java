package SORTING;

import java.util.Arrays;

public class QUESTION3 {
    /* QUE:
    there is array as 0's 1's 2's sort them
    input=[2,0,1,1,2,0]
    output=[0,0,1,1,2,2];

     */
    static int maxnum(int [] arr){
        int max=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max)
                max=arr[i];
        }
        return max;
    }
    static void count(int [] arr){ // 2 0 1 1 2 0
                                  //  0 1 2 3 4 5
        int n= arr.length;
        int [] ans=new int[n];
        int max=maxnum(arr);
        int [] count=new int[max+1];
        for (int i=0;i<arr.length;i++){  // 2 2 2
                                        //  0 1 2
            count[arr[i]]++;
        }
        for (int i=1;i<count.length;i++){ // 2 4 6
                                         //  0 1 2
            count[i]+=count[i-1];
        }
        for (int i=n-1;i>=0;i--){
            int indx=count[arr[i]]-1;
            ans[indx]=arr[i];
            count[arr[i]]--;
        }
        for(int i=0;i<n;i++){
            arr[i]=ans[i];
        }
    }

    public static void main(String[] args) {
        int [] arr = {2,0,1,1,2,0};
        count(arr);
        System.out.println(Arrays.toString(arr));

    }
}
