package ARRAY1D;

import java.util.Scanner.*;
class ARRAY1DPALINDROME{
    public static void main(String[] args) {
        int rem,temp;
        int sum=0;
        int num=-121;
        temp=num;
        while (num != 0) {
            rem=num%10;
            sum=(sum*10)+rem;
            num=num/10;
        }
        if (temp==sum) {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }

    }
}