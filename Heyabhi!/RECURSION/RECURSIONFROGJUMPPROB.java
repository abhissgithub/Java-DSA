package RECURSION;

public class RECURSIONFROGJUMPPROB {
    /*
QUE: There are N stones,numbered 0,1,2,.....N-1. For each (0<=i<N) the height of stone i is Hi.
     There is a frog who is initially on Stone 0,He will repeat the following action
     some number of times to reach Stone N-1
     If the frog is currently on stone i, jumped to the stone i+1 or stone i+2.
     Here, a cost oh |hi-Hj| is incurred, where j is stone where to laand on
      find the minimum possible total cost incurred before frog reaches to the stone N-1.

      input n=4, arr[]=10 30 40 20 output=30
     */
    static int Frog(int [] arr, int n, int idx){
        // base case
        n= arr.length;
        if (idx==n-1){     // at last stone there is nothin to jump
            return 0;
        }
        // recursive work
        // opt1 is for cost from idx+1 stone to last.
        int opt1 = Frog(arr,n,idx+1)+Math.abs(arr[idx+1]-arr[idx]); // if want to jump on 1st stone
        /*
        if there is N-2 stone or there is only two stones remaining in this case you have to return opt1.
         */
        if (idx==n-2) return opt1;
        // opt2 is for cost from idx+2 stone to last.
        int opt2=Frog(arr,n,idx+2)+Math.abs(arr[idx+1])-arr[idx];   // if want to jump on second stone
        /*
        here we find cost from 1st stone and second stone in opt1 & opt2 and then write min b/w them.
         */
        return Math.min(opt1,opt2);
    }
    public static void main(String[] args) {
        int [] arr={10,30,40,20};
        System.out.println( Frog(arr,arr.length,0));

    }
}
