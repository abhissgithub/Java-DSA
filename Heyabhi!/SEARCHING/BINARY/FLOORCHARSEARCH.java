package SEARCHING.BINARY;

import java.util.IllformedLocaleException;

public class FLOORCHARSEARCH {
    static char floorchar(char [] letter,char target){
        int start=0,end=letter.length-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if (target<letter[mid]){
                end=mid-1;
            }
            else
                start=mid+1;
        }
        return letter[(end-1)%letter.length];
    }

    public static void main(String[] args) {
        char [] letter={'a','b','c','d'};
        char target='d';
        System.out.println(floorchar(letter,target));

    }
    
}
