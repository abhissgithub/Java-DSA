package ARRAY1D;

import java.util.Scanner;

public class ARRAY1DRAINWATERTRAPPING2 {
    static int Trapping(int[] arr) {
        int n = arr.length;
        int left[] = new int[n];
        int right[] = new int[n];
        left[0] = arr[0];

        for (int i = 1; i < arr.length; i++) {
            left[i] = Math.max(arr[i], left[i - 1]);
        }
        right[n-1]=arr[n-1];
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], arr[i]);
        }
        int Trapping = 0;
        for (int i = 0; i < n; i++) {
            Trapping += Math.min(left[i], right[i] )- arr[i];
        }
        return Trapping;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of poles");
        int n=sc.nextInt();
        System.out.println("Enter the Height of poles");
        int [] arr = new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
        System.out.println("Total unit of water trap");
        System.out.println(Trapping(arr));
    }
}
