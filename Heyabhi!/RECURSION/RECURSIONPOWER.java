package RECURSION;

import java.util.Scanner;

public class RECURSIONPOWER {
    static double power(double p, int q) {
            if (q == 1) return p;

        return power(p, q - 1) * p;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double p= sc.nextDouble();
        int q=sc.nextInt();
        System.out.println(power(p,q));
    }
}
