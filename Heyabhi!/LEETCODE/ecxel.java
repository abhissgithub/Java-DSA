package LEETCODE;

public class ecxel {
    public String ecs(int num){
        String ans= " ";
        while (num>0){
            int r=num%26;
            num=(num-1)/26;
            r--;
            if (r<0){
                r=25;
            }
            char c= (char) ('A'+r);
            ans=ans+c;
        }
        return ans;

    }
}
