import java.util.Scanner;

public class CanopyAreaCalculator {

    public static int canopyArea(int input1) {
        double pi = 3.14;
        double area = pi * input1 * input1;

        // Custom rounding logic
        int sctvg = (int) (area + 0.5);
        if (area - sctvg == -0.5) {
            sctvg--;
        }

        return sctvg;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the distance from the tree trunk to the edge of the shadow (D): ");
        int D = scanner.nextInt();

        int result =canopyArea(D);

        System.out.println(result); // Output the result

        scanner.close();
    }
}
