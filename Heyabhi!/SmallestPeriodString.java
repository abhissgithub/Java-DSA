import java.util.Scanner;

public class SmallestPeriodString {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String S = scanner.next();
            StringBuilder T = new StringBuilder(S);

            // Find the smallest period
            int smallestPeriod = 1;
            while (smallestPeriod < S.length() && S.charAt(smallestPeriod) == S.charAt(0)) {
                smallestPeriod++;
            }

            // Append necessary characters to T to match the length mentioned in the conditions
            while (T.length() < 25) {
                T.append(S, 0, smallestPeriod);
            }

            System.out.println(T.toString());
        }
    }