package BACKTRACKING;

import java.util.ArrayList;
import java.util.List;

//Using Iteration Method
public class SUBSET1 {
    static List<List<Integer>> sub(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        // Just Make Empty set
        res.add(new ArrayList());
        for(int num:nums){
            // Here We Declare Size for result List
            int n=res.size();
            for(int j=0;j<n;j++){
                // now Copy the list from res List.
                List<Integer>temp=new ArrayList(res.get(j));  //Here We copy empty list
                // Now We Have to add num into  temp
                temp.add(num);
                // Now We Add it into res
                res.add(temp);

            }
        }
        return res;
    }


    public static void main(String[] args) {
        int [] arr={1,2,3};
        System.out.println(sub(arr));
    }
}
