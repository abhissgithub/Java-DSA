import java.util.PriorityQueue;

public class Solution {
    public static void main(String[] args) {
        System.out.println(solve("10101010")); // Output: 1010101010101010
        System.out.println(solve("11111"));   // Output: 11111
        System.out.println(solve("0000"));   // Output: 000

    }

    public static String solve(String S) {
        int K = findPeriod(S);
        StringBuilder T = new StringBuilder();
        for (int i = 0; i <= K; i++) {
            T.append(S);
        }
        return T.toString();
    }

    public static int findPeriod(String S) {
        int n = S.length();
        int xor = 0;
        for (int i = 0; i < n; i++) {
            xor ^= Integer.parseInt(S.substring(i, i + 1));
        }
        int period = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                int xor2 = 0;
                for (int j = 0; j < i; j++) {
                    xor2 ^= Integer.parseInt(S.substring(j, j + 1));
                }
                if (xor == xor2) {
                    period = i;
                    break;
                }
            }
        }
        return period;
    }
}