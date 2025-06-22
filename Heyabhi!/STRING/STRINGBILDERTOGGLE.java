package STRING;

import java.util.*;

public class STRINGBILDERTOGGLE {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("write something to toggle");
        StringBuilder str=new StringBuilder(sc.nextLine());

        //Input-AbHisHeK --> Output - aBhIShEk

        // now we have to iterate on every char & check if it is small/capital
        for(int i=0;i<str.length();i++){
             boolean flag=true; // for capital letter

            char ch=str.charAt(i);  //A

            int asci=(int)ch;  //String to integer

            if (asci>=97) flag=false; //Small letter

            if (flag==true) {
                asci += 32;
                char dh = (char) asci; //a
                str.setCharAt(i, dh);
            }
            else{
                asci-=32;
                char dh=(char) asci;
                str.setCharAt(i,dh);
            }
        }

        System.out.println(str);
    }
}
