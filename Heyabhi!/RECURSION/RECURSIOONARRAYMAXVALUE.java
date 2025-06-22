package RECURSION;

public class RECURSIOONARRAYMAXVALUE {
    static int maxvalue(int [] arr,int idx){
        if (idx==arr.length-1)
            return arr[idx];
        int ans=maxvalue(arr,idx+1);
        return ans=Math.max(ans,arr[idx]);
    }

    public static void main(String[] args) {
        int [] arr ={2,6,3,8};
        System.out.println(maxvalue(arr,0));
    }
}
