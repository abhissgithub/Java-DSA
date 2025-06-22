package RSL;

public class REPLACEWORD {
        public static void main(String[] args) {
            String input = "i.like.this.program.very.much";
            String result = replaceAlternateWords(input);
            System.out.println(result); // Output: "i.abc.this.abc.very.abc"
        }

        public static String replaceAlternateWords(String input) {
            // Convert the input string to a character array
            char[] charArray = input.toCharArray();

            StringBuilder result = new StringBuilder();
            StringBuilder currentWord = new StringBuilder();

            int wordCount = 0;

            // Iterate through each character in the character array
            for (char c : charArray) {
                if (c == '.') {
                    // End of a word, check if it should be replaced
                    if (wordCount % 2 == 1) {
                        result.append("abc");
                    } else {
                        result.append(currentWord);
                    }
                    // Append the dot
                    result.append('.');
                    // Reset the current word builder
                    currentWord.setLength(0);
                    // Increment the word count
                    wordCount++;
                } else {
                    // Build the current word
                    currentWord.append(c);
                }
            }

            // Handle the last word if there is no trailing dot
            if (wordCount % 2 == 1) {
                result.append("abc");
            } else {
                result.append(currentWord);
            }

            return result.toString();
        }
}
