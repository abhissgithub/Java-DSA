package LEETCODE;

public class VALIDNUM {
    public static boolean valid(String s){
        boolean num=false;
        boolean exp=false;
        boolean dot=false;
        for (int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if (c>= '0' && c<='9'){
                return true;
            }
//            For exp
            else if (c =='e' || c =='E'){
                if ( exp || !num){
                    return false;
                }
                exp=true;
                num=false;
//                For dot
            } else if (c=='.') {
                if (dot || exp){
                    return false;
                }
                dot=true;
            } else if (c=='-' || c=='+') {
                if ( i>0 && s.charAt(i-1)!='e' && s.charAt(i-1)!='E' ){
                    return false;
                }

            }
            else return false;
        }
        return num;
    }

    public static void main(String[] args) {
        String a="0";
        System.out.println(valid(a));

    }
}
