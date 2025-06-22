package ARRAY1D;

import java.util.Scanner;

//CHECK PARTITION OF ARRAY INTO TWO SUBARRAYS  HAVING EQUAL SUM//
 public class ARAY1DPREFIXQ3 {
 static void printarray(int [] arr) {
  for (int i : arr) {
   System.out.println(i);
  }
 }
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the Size of array");
  int n= sc.nextInt();
  System.out.println("Enter the"+" "+n+" "+"Elements in array");
  int [] arr = new int[n+1];
  for (int i=1;i<arr.length;i++){
   arr[i]=sc.nextInt();
  }
  System.out.println("Prefix Array is as");
  


 }
}

