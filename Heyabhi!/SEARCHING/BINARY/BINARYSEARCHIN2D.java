package SEARCHING.BINARY;

import java.util.Arrays;

public class BINARYSEARCHIN2D {
 static int[] binary(int [][] arr, int target, int row, int cstart, int cend){
     while (cstart<=cend){
         int mid=cstart+(cend-cstart)/2;
         if (target==arr[row][mid]){
             return new int[]{row,mid};
         }
         if (target<arr[row][mid]){
             cend=mid-1;
         }
         else cstart=mid+1;
     }
     return new int[]{-1,-1};
 }
 static int [] search(int [] [] arr, int target){
     int row=arr.length;
     int col=arr[0].length;
     if (row==1){
         binary(arr,target,0,0,col-1);
     }
    int rstart=0;
    int rowend=row-1;
    int cmid=col/2;
    while (rstart<=rowend){
        int mid=rstart+(rowend-rstart)/2;
        if (target==arr[mid][cmid]){
            return new int[]{mid,cmid};

        }
        if (target<arr[mid][cmid]){
            rowend=mid;
        }
        else rstart=mid;
    }
//    Now We have 2 Rows
//     Now We Check Target in col of 2 Rows
     if (target==arr[rstart][cmid]){         // 1 2 3 4
                                           //   5 6 7 8     if mid =2 target is 2
         return new int[]{rstart,cmid};
     }
     if (target ==arr[rstart+1][cmid]){      // 1 2 3 4
                                            //  5 6 7 8     if target is 6
         return new int[]{rstart+1,cmid};
     }
//     If there is no answer b/w them then we've 4 parts i.e. 1 34 2 78 from above

//     let's see part 1
     if (target<=arr[rstart][cmid-1]){
         binary(arr,target,rstart,0,cmid-1);

     }
//     2nd Part
     if (target>=arr[rstart][cmid+1] && target<=arr[rstart][col-1]){
         binary(arr,target,rstart,cmid+1,col-1);
     }
//     3rd part
     if (target<=arr[rstart+1][cmid-1]){
         binary(arr,target,rstart+1,0,cmid-1);

     }
//     4th Part
     else {
         binary(arr,target,rstart+1,cmid+1,col-1);

     }
     return new int[]{-1,-1};
 }

    public static void main(String[] args) {
        int [] [] arr={
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        int target=3;
        System.out.println(Arrays.toString(search(arr,target)));
    }
}

