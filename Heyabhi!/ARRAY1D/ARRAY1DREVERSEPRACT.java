package ARRAY1D;

public class ARRAY1DREVERSEPRACT {
    static int[] arri(int[] arr) {
        int n = arr.length;
        int j = 0;
        int[] ans = new int[n];
        for (int i = n - 1; i >= 0; i--) {
            ans[j++] = arr[i];

        }
        return ans;


    }
    static void printarray(int [] arr){
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

}

    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int[]ans=arri(arr);
        printarray(ans);

    }
}
