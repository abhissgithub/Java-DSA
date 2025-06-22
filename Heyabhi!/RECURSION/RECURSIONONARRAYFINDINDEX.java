package RECURSION;

import java.util.Scanner;

public class RECURSIONONARRAYFINDINDEX {
    static void findindex(int [] arr,int x, int indx){
        if (indx>=arr.length){
            return;
        }
        if (arr[indx]==x){
            System.out.println(indx);
        }
        findindex(arr,x,indx+1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int [] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        System.out.println(" enter target x");
        int x= sc.nextInt();
        findindex(arr,x,0);
    }

}
