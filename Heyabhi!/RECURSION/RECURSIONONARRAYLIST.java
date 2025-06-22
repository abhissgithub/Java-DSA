package RECURSION;

import java.util.ArrayList;

public class RECURSIONONARRAYLIST {

    //ssq(ABC)==A,B,C,AB,AC,BC,ABC,"";
    static ArrayList<String>ssq(String s){
        ArrayList<String>ans=new ArrayList<>();
        if (s.length()==0){
            ans.add(" ");
            return ans;

        }
        char curr = s.charAt(0);
        ArrayList<String>smallsum=ssq(s.substring(1));
        //if want to stay
        for (String ss:smallsum){
            ans.add(ss);
            ans.add(curr+ss);
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<String>ans=ssq("abc");
        for (String ss:ans){
            System.out.println(ss);
        }

    }
}