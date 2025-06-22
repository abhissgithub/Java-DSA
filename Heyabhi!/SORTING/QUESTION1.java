package SORTING;

/* que;
  there is ascending sorted array but at two point it is conflicted so make array again sorted

  input=[1,2,3,6,5,4,7,8]

  output=[1,2,3,4,5,6,7,8]

 */

import java.util.Arrays;

public class QUESTION1 {
    static void sort(int [] arr) {
        int n = arr.length;
        int x = -1, y = -1;

        for (int i = 1; i < n; i++) {
            if (arr[i - 1] > arr[i]) {
                if (x == -1) {
                    x = i - 1;
                    y = i;
                } else
                    y = i;

            }
        }
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }

    public static void main(String[] args) {
        int[]arr={1,2,3,6,5,4,7,8};
        sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
