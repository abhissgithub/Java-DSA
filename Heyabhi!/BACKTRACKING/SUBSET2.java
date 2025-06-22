package BACKTRACKING;

import java.util.ArrayList;
import java.util.List;

//USING BACKTRACKING
public class SUBSET2 {
    static List<List<Integer>>sub(int [] arr){
        List<List<Integer>>res=new ArrayList<>();
        getsubset(0, arr,res,new ArrayList<>());
        return res;
    }
    static void getsubset(int indx,int [] arr,List<List<Integer>>res,List<Integer>temp){
        //            Add Empty List
        res.add(new ArrayList<>(temp));
        for (int i=indx;i<arr.length;i++){
//            Now Add Element to list
            temp.add(arr[i]);
            getsubset(i+1,arr,res,temp);
            temp.remove(temp.size()-1);

        }
    }

    public static void main(String[] args) {
        int[]arr={1,2,3};
        System.out.println(sub(arr));
    }
}
