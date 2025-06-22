package BACKTRACKING;

public class MAZECOUNTPATH {
//    COUNT THE NO OF WAYS TO REACH THE DESTINATION
    static int count(int r, int c){
        if (r == 1 || c == 1){
            return 1;
        }
        int right=count(r,c-1);
        int left=count(r-1,c);
        return right+left;
    }

    public static void main(String[] args) {
        System.out.println ("There Are "+count(3,3)+" Ways To Reach the Destination");

    }
}
