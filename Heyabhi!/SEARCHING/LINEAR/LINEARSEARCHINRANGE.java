package SEARCHING.LINEAR;

public class LINEARSEARCHINRANGE {
    static int search(int [] arr,int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==target){
                return i;
            }

        }
        System.out.println("Target not found");
        return -1;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        int target=5;
        search(arr,target);
        System.out.println(search(arr,target));


    }
}
