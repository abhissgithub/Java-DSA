import java.util.Scanner;

public class PRIMENUMBERS {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int flag=0;
        for (int i=2;i<=a/2;i++) {
            if (a % i == 0) {
                System.out.println("the num is not prime");
                flag = flag + 1;
                break;
            }
        }if (flag==0){
            System.out.println("num is prime");


        }

    }
}
