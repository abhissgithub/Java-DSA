package BACKTRACKING;

public class MAZEFINDPATH {
//    FIND THE PATH AND WRITE IT
static int count(int r, int c){
    if (r == 1 || c == 1){
        return 1;
    }
    int right=count(r,c-1);
    int left=count(r-1,c);
    return right+left;
}
static void path(String p,int r, int c){
    if (r==1 && c==1){
        System.out.println(p);
    }
    if (r>1){
        path(p + "Down ",r-1,c);
    }
    if (c>1){
        path(p + "Right ",r,c-1);
    }

}

    public static void main(String[] args) {
        System.out.println ("There Are "+count(3,3)+" Ways To Reach the Destination --^--");
        path(" ",3,3);
    }
}
