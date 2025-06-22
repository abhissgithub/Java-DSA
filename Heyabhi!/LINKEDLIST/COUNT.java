package LINKEDLIST;

import java.util.ArrayList;

public class COUNT {
    public int incremovableSubarrayCount(int[] nums) {
        ArrayList<Integer> ans=new ArrayList<>();
        int count=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<nums[i+1]){
                ans.add(i);
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        ArrayList<Integer> ans=new ArrayList<>();
        ans.add(1);
        ans.add(2);

    }
}
