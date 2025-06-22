package ARRAY1D;

class ARRAY1DQUEPRACT {


    public static void pow(int a, int b, int c) {
        int[] arr=new int[10];
        int num = 1;

        int n = 1;
        arr[0] = 1;
        arr[1] = 1;
        for (int i =1; i <= b; i++) {

            num = num * a;
            n = n * c;
            arr[i +1] = num;
            arr[i+2] = n;
        }
        for (int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        ARRAY1DQUEPRACT a1 = new ARRAY1DQUEPRACT();
        a1.pow(2,3,5);

    }
}
