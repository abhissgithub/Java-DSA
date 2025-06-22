package SEARCHING.BINARY;
// Rotated Array = Array Rotated clockwise
// arr=[1,2,3,4,10,11,12];
//Rotated arr=[10,11,12,1,2,3,4]

class ROTATEDSORTEDARRAY {
    static int search(int[] arr, int target) {
        int pivot=pivot(arr);
        if(pivot==-1){
            return binary(arr,target,0,arr.length-1);
        }
        if(arr[pivot]==target){
            return pivot;
        }
        if(target>=arr[0]){
            return binary(arr,target,0,pivot-1);
        }
        return binary(arr,target,pivot+1,arr.length-1);

    }
    static int pivot(int [] arr){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(mid < end && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(mid > start && arr[mid]<arr[mid-1]){
                return mid-1;
            }
            if(arr[start]>=arr[mid]){
                end=mid-1;

            }
            else{
                start=mid+1;
            }

        }
        return -1;
    }
//    static int isasce(int [] arr,int target){
//        int start=0;
//        int end=arr.length-1;
//        boolean asc=arr[start]<arr[end];
//        while(start<=end){
//            int mid=start+(end-start)/2;
//
//            if(arr[mid]==target){
//                return mid;
//            }
//            if(asc){
//                if(arr[mid]<target){
//                    start=mid+1;
//                }
//                else end=mid-1;
//            }
//            else{
//                if(target<arr[mid]) {
//                    start = mid + 1;
//                }
//                else end=mid-1;
//            }
//
//        }
//        return -1;
//    }
    static int binary(int [] arr,int target,int start,int end){
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]>target){
                end=mid-1;
            }
            else if(arr[mid]<target){
                start=mid+1;

            }
            else{
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] arr={3,3,3,1};
       int target=1;
        System.out.println(search(arr,target));
    }
}

