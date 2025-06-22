package BITMANIPULATION;

public class UNIQNUM {
    public static void main(String[] args) {
        int [] arr = {-3,-2,-1,5,1,2,3};
        System.out.println(uni(arr));
    }
    public static int uni (int [] arr){
        int sum = 0 ;
        for (int n: arr){
            sum+=n;
        }
        return sum;
    }

}
