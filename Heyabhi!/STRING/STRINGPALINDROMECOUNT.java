package STRING;

// QUESTION ; Given a string s, return the no. of palindromic substring in it.

public class STRINGPALINDROMECOUNT {
    public static boolean Ispalimdrome(String s){
//        boolean flag=true; //palindrome

        int i=0;
        int j=s.length()-1;
        while (i<j){
            if (s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
        }

    public static void main(String[] args) {
        String str="abbd";
        int count=0;
        for (int i=0;i<str.length();i++){
            for (int j=i+1;j<=str.length();j++){
                if (Ispalimdrome(str.substring(i,j))==true){
                    System.out.print(str.substring(i,j)+" ");
                    count++;
                }
            }

        }
        System.out.println("\nThe number of palindromic substring is: " + count);
    }
    }
