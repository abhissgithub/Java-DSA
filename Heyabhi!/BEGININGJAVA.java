import HEAPS.Heap;

import java.util.Scanner;
import java.util.*;

public class BEGININGJAVA {
    public void hep(){
        PriorityQueue<Integer>ans=new PriorityQueue<>();

    }
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the Name of person");
//        String name= sc.next();
////        if (m%2==0){
////            System.out.println("The number is Even");
////        }
////        else {
////            System.out.println("The number is odd");
////        }
////    }
//        System.out.println("Hello"+" "+ name+" "  +"welcome to the world of programming");
//
//    }
//        String x="Addresses";
//        String ans="";
//        int i;
//        for (i=0;i<x.length();i++){
//            int count=0;
//            for (int j=i;j<x.length();j++){
//                if (x.charAt(i)==x.charAt(j)){
//                    count++;
//                    break;
//                }
//            }
//            ans+=x.charAt(i)+Integer.toString(count);
//        }
//        System.out.println(ans);

//
//        int input=30;
//        if(input%3==0){
//            System.out.println("Raja");
//        }
//        else if (input%5==0){
//            System.out.println("software");
//        }
//        if (input%3==0 && input%5==0){
//            System.out.println("Raja Softwaare");
//        }
//        else {
//            System.out.println("Exit");
//        }

//
        int a[] = {1, 2, 3, 4, 5};

        int sum = 0;

        for(int i = 0; i < 5; i++) {

            if(i % 2 == 0) {

                sum += a[i];

            }

        }

    }
    public static int neW(int [] arr){

        if (arr.length==0){
            return 0;
        }
        int i=0;
        for (int j=1;j<arr.length;j++){
            if (arr[j]!=arr[i]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;


    }
}
