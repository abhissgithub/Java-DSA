package RECURSION;

import java.util.Scanner;

public class RECURSIONONSTRNGREMOVEOCRNCE {
    static String Remove(String s, int idx){
        if (idx==s.length()) return " ";
        String smallans=Remove(s,idx+1);
        char current = s.charAt(idx);
        if (current != 'a') return current+smallans;
        else {
            return smallans;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        System.out.println(Remove(s,0));
    }
}