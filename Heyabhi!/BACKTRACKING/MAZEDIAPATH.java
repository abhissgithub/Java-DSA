package BACKTRACKING;

import java.util.ArrayList;

public class MAZEDIAPATH {
//    TRAVERSE DIAGONALLY
    static ArrayList<String> mazed(String p, int r, int c){
        if (c==1 && r == 1){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> list=new ArrayList<>();
        if (r>1){
            list.addAll(mazed(p+"V ",r-1,c));
        }
        if (c>1){
            list.addAll(mazed(p+"H ",r,c-1));
        }
        if (r>1&&c>1){
            list.addAll(mazed(p+"D ",r-1,c-1));
        }
        return list;

    }

    public static void main(String[] args) {
        System.out.println(mazed(" ",3,3));
    }
}
