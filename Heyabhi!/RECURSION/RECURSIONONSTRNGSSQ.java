package RECURSION;

public class RECURSIONONSTRNGSSQ {
    static void printssq(String s,String current) {
        if (s.length() == 0){
            System.out.println(current);
        return;
    }
            char currn=s.charAt(0);
        String remainin=s.substring(1);
        // which want to stay
        printssq(remainin,current+currn);
        // which don't want to stay
        printssq(remainin,current);


    }

    public static void main(String[] args) {
        printssq("abc","");
    }


}
