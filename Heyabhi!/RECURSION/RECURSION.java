package RECURSION;

import java.util.Scanner;

public class RECURSION {
    static void PrintIncreasing(int n){

        if (n==1){
            System.out.println(n);

            return;
        }
         PrintIncreasing(n-1);
        System.out.println(n);


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PrintIncreasing(n);
        }
    }
