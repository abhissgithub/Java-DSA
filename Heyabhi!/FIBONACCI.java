import java.util.Scanner;

public class FIBONACCI {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number to print");
        int n= sc.nextInt();
        int a=0;
        int b=1;
        int sum=1;
        System.out.print(a+" ");
        System.out.print(b+" ");
        for (int i=1;i<=n-2;i++) {
            int c = a + b;
            a = b;
            b = c;
            System.out.print(c + " ");
            sum=sum+c;
        }
        System.out.println(" ");

        System.out.println("sum of all number is "+sum);





    }

}
