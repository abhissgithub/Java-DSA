package SEARCHING.BINARY;
public class SQUAREROOT {
    static int sqrt(int x){
        int ans=-1;
        int start=0;
        int end=x;
        while (start<=end){
            long mid=start+(end-start)/2;
            int square = (int) (mid*mid);
            if (square==x) {
                return (int) mid;
            } else if (square<x) {
                ans= (int) mid;
                start= (int) (mid+1);
                
            }
            else end= (int) (mid-1);

        }
        return ans;
    }
    
    public static void main(String[] args) {
        int x=26;
        System.out.println(sqrt(x));
    }


}
