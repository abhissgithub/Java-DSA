package SORTING;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class THREESUM {
    static List<List<Integer>>Three(int [] arr){
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();
        for (int i=0;i<arr.length-2;i++){
            if (i>0&& arr[i]==arr[i-1] ){
                continue;
            }
            int j=i+1;
            int k=arr.length-1;
            while (j<k)
            {
                int sum=arr[i]+arr[j]+arr[k];
                if (sum==0){
                    ans.add(Arrays.asList(arr[i],arr[j],arr[k]));
                    while (j<k && arr[j]==arr[j+1]){
                        j++;

                    }
                    while (j<k && arr[k]==arr[k-1]){
                        k--;
                    }
                    j++;
                    k--;
                }
                else if (sum<0){
                    j++;
                }
                else k--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
       List<int[]> ans=new ArrayList<>();
       int [] arr = {-1,2,1,-1,-2,0};
        System.out.println(Three(arr));

    }
}