package SEARCHING.BINARY;

public class ROTAEDSORTEDARRAY3 {

//    WRITE THE NUMBER OF TIMES ARRAY IS ROTATED
//    arr=[4,5,6,7,0,1,2,3];
//         0 1 2 3P 4 5 6 7
//    Real array may be [0,1,2,3,4,5,6,7]
//    R1: [7,0,1,2,3,4,5,6]
//    R2: [6,7,0,1,2,3,4,5]
//    R3: [5,6,7,0,1,2,3,4]
//    R4: [4,5,6,7,0,1,2,3] <----- OG Array i.e. 4 Times Rotation
//    i.e. Pivot+1

    static int Pivot(int [] arr){
        int start=0;
        int end =arr.length-1;
        while (start<=end)
        {
            int mid=start+(end-start)/2;

            if (mid < end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if (mid > start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if (arr[start]>=arr[mid]){
                end=mid-1;
            }
            else
                start=mid+1;
        }
        return -1;
    }
    static int CountRotation(int [] arr){
        int pivot=Pivot(arr);
        if (pivot==-1){
            return 0;

        }
        return pivot+1;
    }

    public static void main(String[] args) {
        int [] arr={4,5,6,7,0,1,2};
        System.out.println(CountRotation(arr));
    }
}
