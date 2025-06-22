public class PRIMENUMBER {
    public static void main(String[] args) {
        int i = 0;
        int n = 0;
        String prime = " ";
        for (i = 1; i <= 50; i++) {
            int m = 0;
            for (n = 1; n >= 1; n--) {
                n=0;
                if (i % n == 0) {
                    m = m + 1;
                }
            }
            if (m == 2) {
                prime = prime + i + " ";
            }
        }
        System.out.println("Prime numbers from 1 to 50 are:"+prime);

    }
}