package ARRAY1D;//BEST TIME TO BUY AND SELL STOCK

import java.util.Scanner;

public class ARRAY1DSTOCK {
    public static int Maxprofit(int [] arr) {
        int profit = 0,faraway=arr[0], Maxprofit = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            faraway=Math.min(faraway,arr[i]);
            profit=(arr[i]-faraway);
            if (profit>Maxprofit)
                Maxprofit=profit;
            }
            return Maxprofit;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of days in which you want to buy and sell of the stock ");
        int n=sc.nextInt();
        int [] arr=new int[n];
        System.out.println("enter the price of Stocks want to buy and then Sell" );
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("you get maximum profit of Rs: "+Maxprofit(arr));

    }
}
