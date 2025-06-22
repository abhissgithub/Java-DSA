import java.util.Scanner;

public class SWAPING {
    public SWAPING(int[] arr, int left, int right) {
    }

    static void sswap(int a, int b){
        System.out.println("Original Values of ");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("Values After Swapping :");
        System.out.println("a: "+a);
        System.out.println("b: "+b);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        int b = sc.nextInt();
        sswap(a,b);

    }
}
