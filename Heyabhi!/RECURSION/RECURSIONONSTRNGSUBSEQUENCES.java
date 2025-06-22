package RECURSION;

import java.util.ArrayList;

public class RECURSIONONSTRNGSUBSEQUENCES {

    // Subsequnes [ABC]=[A,B,C,AB,AC,BC,ABC," "]  2^3=8

    //FOR MORE SEE NOTEBOOK
    static ArrayList<String>SSQ(String s) {        //store in arraylist
        ArrayList<String> ans = new ArrayList<>();

        // base case
        if (s.length() == 0) {
            ans.add(" ");
            return ans;
        }
        char curr = s.charAt(0);    // if ssq(bc)==b,c,bc," "; ssq(abc)==a,b,c,ab,ac,bc,abc,"";
        //ssq(abc)== "a"+ssq(bc) && ssq(bc);

        // Recursive work to find ssq("bc") ie. b,c,bc," ";

        ArrayList<String> Smallans = SSQ(s.substring(1));
        for (String SS : Smallans) {  // for loop is for traverse on arraylist smallans and the ssq(bc) and store in String ss;
            ans.add(SS);
            ans.add(curr + SS);    // here we just add "a" to ssq(bc); from line 16
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<String>ans=SSQ("abc");
        for (String ss: ans){   // we traverse on arraylist ans and here we store all the ssq(ans) in string ss;
            System.out.println(ss);
        }
    }
}
