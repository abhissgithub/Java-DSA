package SEARCHING.LINEAR;

import java.util.Arrays;

public class LINEARSEARCHONSTRING{
    static boolean string(String str,char target){
        for (int i=0;i< str.length();i++) {
            if (target==str.charAt(i)) {
                return true;

            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "abhi";
        char target='a';
        string(str,target);
        System.out.println(string(str,target));
    }
}
