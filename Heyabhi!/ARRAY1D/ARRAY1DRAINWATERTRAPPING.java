package ARRAY1D;

import java.util.Scanner;

public class ARRAY1DRAINWATERTRAPPING {
    public static int Trapping(int[] arr) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        int Leftmaxheight = arr[0], Rightmaxheight = arr[n - 1];
        int Trapwater = 0;
        while (left < right) {
            if (Leftmaxheight < Rightmaxheight) {
                left++;
                if (Leftmaxheight < arr[left]) {
                    Leftmaxheight = arr[left];

                } else {
                    Trapwater = Trapwater + Leftmaxheight - arr[left];// arr[left]=arr[0/1/3] i.e. on that array we are from left side
                }
            } else {
                right--;
                if (Rightmaxheight < arr[right]) {
                    Rightmaxheight = arr[right];
                } else {
                    Trapwater = Trapwater + Rightmaxheight - arr[right];

                }
            }
        }
        return Trapwater;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of bars");
        int n = sc.nextInt();
        System.out.println("Enter the heights of bar");
        int [] arr = new int[n];
        for (int i =0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Trapping(arr));

    }
}
