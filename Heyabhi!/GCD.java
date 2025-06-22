import java.util.Scanner;

public class GCD {
    static int gcd(int x,int y){    // x is divisor
                                    // y is divident
        while (x%y!=0) {
            int rem = x % y;
//            acording to longest division rule we find gcd by initially
//              x is divisor  & y is divident
//Then we make reminder divisor and then previous divisor will be divident and so on till reminder will be 0 //
            x=y;
            y=rem;
        }
        return y;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y= sc.nextInt();
        System.out.println(gcd(x,y));

    }
}
