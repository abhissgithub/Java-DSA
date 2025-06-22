import java.util.*;
public class WatchtowerOverlap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();

        int[][] ranges = new int[N][2];

        for (int i = 0; i < N; i++) {
            ranges[i][0] = scanner.nextInt(); // li
            ranges[i][1] = scanner.nextInt(); // ri
        }
        int overlapCount = 0;
        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                if (rangesOverlap(ranges[i], ranges[j])) {
                    overlapCount++;
                }
            }
        }
        System.out.println(overlapCount);

        scanner.close();
    }
    public static boolean rangesOverlap(int[] range1, int[] range2) {
        return Math.max(range1[0], range2[0]) <= Math.min(range1[1], range2[1]);
    }
}
