package OOP;

public class MinimumCostPartition {

    public static int minCostPartition(int[] nums) {
        int n = nums.length;
        int[] prefixSum = new int[n + 1];
        int[] minCost = new int[n + 1];

        for (int i = 0; i < n; i++) {
            prefixSum[i + 1] = prefixSum[i] + nums[i];
        }

        for (int i = 3; i <= n; i++) {
            minCost[i] = Integer.MAX_VALUE;
            for (int j = 1; j <= i - 2; j++) {
                int cost = prefixSum[i] - prefixSum[j];
                minCost[i] = Math.min(minCost[i], cost + minCost[j]);
            }
        }

        return minCost[n];
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 12};
        int result = minCostPartition(nums);
        System.out.println("Minimum cost: " + result);
    }
}
