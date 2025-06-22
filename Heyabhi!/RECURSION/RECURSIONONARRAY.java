package RECURSION;

public class RECURSIONONARRAY {
    static void printarray(int [] arr, int i){   // HERE i IS FOR ALTERATION
        if (i == arr.length)
            return;
        System.out.println(arr[i]);
        printarray(arr,i+1);
    }

    public static void main(String[] args) {
        int [] arr={5,6,7,8};
        printarray(arr,0);
        }

    }
