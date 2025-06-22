import java.util.Scanner;

public class RichieWorldRobbery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of streets and hours
        int N = scanner.nextInt();
        int H = scanner.nextInt();

        // Array to store the number of houses on each street
        int[] houses = new int[N];
        int maxHouses = 0;

        // Read the number of houses on each street and find the maximum
        for (int i = 0; i < N; i++) {
            houses[i] = scanner.nextInt();
            maxHouses = Math.max(maxHouses, houses[i]);
        }

        // Binary search for the minimum K
        int left = 1, right = maxHouses;
        int result = maxHouses;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (canRobAllHouses(houses, H, mid)) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        // Output the minimum value of K
        System.out.println(result);

        scanner.close();
    }

    // Function to check if all houses can be robbed within H hours at speed K
    private static boolean canRobAllHouses(int[] houses, int H, int K) {
        long hoursNeeded = 0;
        for (int housesOnStreet : houses) {
            hoursNeeded += (housesOnStreet + K - 1) / K; // Equivalent to Math.ceil(housesOnStreet / (double) K)
        }
        return hoursNeeded <= H;
    }
}
