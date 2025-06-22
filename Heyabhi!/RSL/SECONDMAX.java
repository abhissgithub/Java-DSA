package RSL;
import java.util.*;
public class SECONDMAX {
    public static void printSecondMaxDifference(int[] arr) {
            if (arr.length < 2) {
                System.out.println("Array must have at least two elements");
                return;
            }

            // Calculate the differences and store them in an array
            int n = arr.length;
            int[] diff = new int[n * (n - 1) / 2];
            int index = 0;

            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    diff[index++] = Math.abs(arr[i] - arr[j]);
                }
            }

            // Sort the differences array
            Arrays.sort(diff);

            // Find the second maximum difference
            int maxDiff = diff[diff.length - 1];
            int SecondMaxDiff = Integer.MIN_VALUE;

            for (int i = diff.length - 2; i >= 0; i--) {
                if (diff[i] < maxDiff) {
                    SecondMaxDiff = diff[i];
                    break;
                }
            }

            System.out.println("The second maximum difference is: " + SecondMaxDiff);
        }

        public static void main(String[] args) {
            int[] numbers = {14,12,70,15,95,65,22,30};
            printSecondMaxDifference(numbers);
        }

}
