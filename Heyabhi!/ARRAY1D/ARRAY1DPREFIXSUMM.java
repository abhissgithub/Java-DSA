package ARRAY1D;

import java.util.Scanner;

//*********************PREFIXSUM FOR SINGLE ARRAY******************************//
//*********************PREFIXSUM FOR SINGLE ARRAY******************************//
//*********************PREFIXSUM FOR SINGLE ARRAY******************************//
//*********************PREFIXSUM FOR SINGLE ARRAY******************************//
//
//
public class ARRAY1DPREFIXSUMM {
    static void printarray(int [] arr){
        for (int j:arr){
            System.out.println(j);
        }
    }

    public static int [] prfixarray(int [] arr){
        for (int i=1;i<arr.length;i++){
            arr[i]=arr[i-1]+arr[i];
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of array");
        int n= sc.nextInt();
        System.out.println("Enter the" +n+"Elements in array");
        int [] arr = new int[n];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Prefix Array is as");
        printarray(prfixarray(arr));


    }
}
