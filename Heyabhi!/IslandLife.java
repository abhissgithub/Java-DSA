import java.util.Scanner;

public class IslandLife {

    public static int minBoxes(int N, int E, int D) {
        int totalSweetsNeeded = E * D;
        int boxesNeeded = (int) Math.ceil((double) totalSweetsNeeded / N);
        int sundays = (D + 6) / 7;
        int buyingDays = D - sundays;

        if (boxesNeeded > buyingDays) {
            return -1;
        }

        return boxesNeeded;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int E = scanner.nextInt();
        int D = scanner.nextInt();

        int result = minBoxes(N, E, D);

        System.out.println(result); // Output the result

        scanner.close();
    }
}
