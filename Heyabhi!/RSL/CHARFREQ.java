package RSL;
import java.util.*;
public class CHARFREQ {
        public static void main(String[] args) {
            String input = "rajasoftwarelabs";
            frequencyOfCharacters(input);
        }

//        public static void frequencyOfCharacters(String str) {
//            // Characters to check for
//            char[] Characters = {'b', 'f', 'j', 'p', 'v'};
//
//            // Convert input string to lowercase to ignore case
//            str = str.toLowerCase();
//
//            // Initialize a map to hold the frequency of target characters
//            int[] frequency = new int[26]; // Assuming only lowercase a-z
//
//            // Initialize total count
//            int totalCount = 0;
//
//            // Count frequencies
//            for (char c : str.toCharArray()) {
//                if (c >= 'a' && c <= 'z') {
//                    frequency[c - 'a']++;
//                }
//            }
//
//            // Print frequencies and calculate total count for target characters
//            for (char c : Characters) {
//                int count = frequency[c - 'a'];
//                System.out.println(c + ": " + count);
//                totalCount += count;
//            }
//
//            // Print total count
//            System.out.println("Total=" + totalCount);
//        }
        public static void frequencyOfCharacters(String str) {
            // Characters to check for
            char[] targetCharacters = {'b', 'f', 'j', 'p', 'v'};

            // Convert input string to lowercase to ignore case
            str = str.toLowerCase();

            // Initialize a map to hold the frequency of target characters
            Map<Character, Integer> frequency = new HashMap<>();

            // Initialize total count
            int totalCount = 0;

            // Count frequencies
            for (char c : str.toCharArray()) {
                for (char target : targetCharacters) {
                    if (c == target) {
                        frequency.put(c, frequency.getOrDefault(c, 0) + 1);
                        totalCount += 1;
                        break;
                    }
                }
            }

            // Print frequencies
            for (Map.Entry<Character, Integer> entry : frequency.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

            // Print total count
            System.out.println("Total count of target characters: " + totalCount);
        }
    }

