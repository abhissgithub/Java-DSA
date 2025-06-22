import java.util.Scanner;

public class SWAPINGQUE {
    static int change(int a, int b)
    {
        System.out.println("original value of");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Values after swap");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        return 0;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b = sc.nextInt();
        System.out.println(change(a,b));

    }
}
