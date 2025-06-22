package SORTING;

import java.util.Arrays;
public class COUNTSORTUNSTABLE {
    static int maxnum(int [] arr){
        int mx=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>mx) mx=arr[i];
        }
        return mx;
    }
    static void count(int  [] arr){      // 1 2 1 3 2 1
        int max=maxnum(arr);
        int [] output=new int[max+1];
        for (int i=0;i<arr.length;i++){
            output[arr[i]]++;       // 0 3 2 1  <----num repeated
                                   //  0 1 2 3  <---- num
        }
        int k=0;
        for (int i=0;i<output.length;i++){      // 0 3 2 1
            for (int j=0;j<output[i];j++){
                arr[k++]=i;
            }
        }

    }

    public static void main(String[] args) {
        int [] arr ={3,2,3,1,2,4,5,5,6};
        System.out.println("Array before swaping");
        System.out.println(Arrays.toString(arr));
        System.out.println("Array after swaping");
        count(arr);
        System.out.println(Arrays.toString(arr));
    }
}

