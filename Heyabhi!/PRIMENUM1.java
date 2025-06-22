import java.util.Scanner;

public class PRIMENUM1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number you want to check");
        int a=sc.nextInt();
        int b=0;
        for (int i=2;i<=a/2;i++){
            if(a%i==0){
                System.out.println("num is not prime");
                b=b+1;
                break;
            }
        }if(b==0){
            System.out.println("prime");
        }
    }
}
