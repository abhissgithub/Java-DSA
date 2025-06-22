package SEARCHING.BINARY;
class RACINGTRACK{
    static boolean ispossible(int [] arr, int m, int distance){
        int stuplaced=1;
        int stuposition=arr[0];
        for (int i=1;i<arr.length;i++){
            if (arr[i]-stuposition>=distance){
                stuplaced++;
                stuposition=arr[i];
            }
        }
        return stuplaced>=m;

    }
    static int  distane (int [] arr,int m){
        int start=0;
        int end=(int) 1e9;
        int ans=-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if (arr.length<m)  return -1;
            if (ispossible(arr,m,mid)){
                ans=mid;
                start=mid+1;
            }
            else end = mid-1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int [] arr={1,2,4,8,9};
        int m=3;
        System.out.println(distane(arr,m));
    }

}