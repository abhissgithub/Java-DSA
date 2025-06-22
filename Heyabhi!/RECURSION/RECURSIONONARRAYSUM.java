package RECURSION;

public class RECURSIONONARRAYSUM {
    static int sumofarray(int[]arr,int idx){
        if (idx==arr.length-1)
            return arr[idx];
        int sum=sumofarray(arr,idx+1);
        return sum+arr[idx];
    }

    public static void main(String[] args) {
        int [] arr ={1,2,3,4};
            System.out.println(sumofarray(arr,0));
        }
    }
