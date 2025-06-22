package SORTING;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.*;

public class CYCLESORTMISSINGNUMS {
/*
-------> GOOGLE QUESTION <-------
Input=[2,1,4,3,6,7,9]
Output= [5,8] --Missing nums from array

Input=[1,1]
Output=[2]
 */
    static void swap(int [] arr, int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static List<Integer> Misingnums(int[] arr)
    {
        for (int i=0;i<arr.length;i++){
            int indx=arr[i]-1;
            if (arr[i]< arr.length && arr[i]!=arr[indx]){
                swap(arr,i,indx);
            }
            else i++;
        }
        List<Integer>ans=new ArrayList<>();
        for (int indx=0;indx<arr.length;indx++){
            if (arr[indx]!=indx+1){
                ans.add(indx+1);
            }
        }
        return ans;

    }

    public static void main(String[] args) {
        int [] arr ={3,0,1};
        System.out.println(Misingnums(arr));



    }
}
