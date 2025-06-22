package RECURSION;

import java.util.Scanner;

public class RECURSIONCOUNTDIGIT {
    static int countdigit(int n) {

        if (n >= 0 && n <= 9) return 1;
        return countdigit(n/10)+1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countdigit(n));

    }
}
