package RECURSION;

import java.util.Scanner;

class RECURSIONONSTRNGPALINDROME{
    static boolean palindrome(String s, int l , int r){
        if(l>=r) return true;
        //when l>=r there is only one element and one element is a palindrome ex.aba here b is palindrome

        return (s.charAt(l)==s.charAt(r) && palindrome(s,l+1,r-1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(palindrome(s,0,s.length()-1));
    }
}