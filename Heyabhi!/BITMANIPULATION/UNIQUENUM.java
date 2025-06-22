package BITMANIPULATION;

public class UNIQUENUM {
    public static void main(String[] args) {
        int [] arr = {1,2,3,3,4,2,1};
        System.out.println(unique(arr));
    }
    public static int unique (int [] arr){
        int unq=0;
        for (int n : arr){
            unq ^= n;
        }
        return unq;
    }


}
