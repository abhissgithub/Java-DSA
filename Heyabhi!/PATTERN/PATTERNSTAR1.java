package PATTERN;

public class PATTERNSTAR1 {
    public static void main(String[] args) {

        for (int i = 4; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j =5;j>=2*(i-1);j--){
                System.out.print("*");

            }
            for (int j = i; j>0; j--) {
                System.out.print(j);

            }
            System.out.println();


        }

    }
}
