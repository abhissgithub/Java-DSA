package PATTERN;

public class PATTERNTRIANGLE {
    public static void main(String[] args) {
        for (int i = 1; i<=4; i++) {
            for (int j=1;j<=4;j++) {
                if (i+j==5||i==4){
                    System.out.print("*");
                }else
                {
                    System.out.print(" ");
                }

            }
            for(int j=5;j<=7;j++)
            {
                if(j-i==3||i==4)
                {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }

         }
    }
}
