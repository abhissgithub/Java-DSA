package RECURSION;

import java.util.Scanner;// PRINT NATURAL NUMBERS FROM N TO 1
public class RECURSIONFROMNTO1 {
    public static void Return(int n){
      if (n<1) {
        return;
    }
        System.out.println(n);
    Return(n-1);

}
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Upto which you want to print");
    int n= sc.nextInt();
    Return(n);
}


}
