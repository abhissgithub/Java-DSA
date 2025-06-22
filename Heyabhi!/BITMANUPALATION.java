public class BITMANUPALATION {
    public static void main(String[] args) {
        int [] arr={1,2,1,4,2,6,6};
        System.out.println(xoor(arr));

    }
    static int xoor(int [] arr){
        int result=0;
        for(int i=0;i<arr.length;i++){
            result=result^arr[i];
        }
        return result;
    }
}
