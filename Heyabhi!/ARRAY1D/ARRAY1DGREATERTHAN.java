package ARRAY1D;

import java.util.Scanner;

class ARRAY1DGREATERTHAN {
    static int countnum(int [] arr, int x){
        int greathan=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]>x){
                greathan++;
            }
        }
        return greathan;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int arr [] = new int [size];
        System.out.println("entert the "+size + "elements in array");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the value of x ");
        int x= sc.nextInt();
        System.out.println(countnum(arr,x));
        }
    }