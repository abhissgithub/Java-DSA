package STRING;

import java.util.Scanner;

public class STRINGREVERSEE {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The String");
        String a= sc.next();
        String b="";
        for (int i=a.length()-1;i>=0;i--){
            b=b+a.charAt(i);

        }
        System.out.println("Reverse String is : "+b);

    }
}
