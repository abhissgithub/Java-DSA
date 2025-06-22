package RSL;


import java.util.Scanner;

public class Test {
public  static  int max(int [] arr){
    int n=arr.length;
    int m = arr[0];
    for (int i=1;i<n;i++){
        if (m < arr[i]){
            m=arr[i];
        }
    }
    return m;
}
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int arr [] = new int [size];
        System.out.println("entert the "+size + "elements in array");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(max(arr));
    }

}
