package ARRAY1D;

import java.util.Scanner;

class ARRAY1DSORTINGCHECK {
    static boolean sorti(int [] arr){
        boolean check=true;
        for (int i=1;i<arr.length;i++){
            if (arr[i]<arr[i-1]){
                check=false;
                break;


            }
        }
        return check;
}
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int size= sc.nextInt();
        int [] arr= new int[size];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();

        }
        System.out.println(sorti(arr));


    }
}