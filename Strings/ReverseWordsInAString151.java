package Strings;
public class ReverseWordsInAString151 {

    // LeetCode method
    public String reverseWords(String s) {
        int n = s.length();
        StringBuilder word = new StringBuilder();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);

            if (ch != ' ') {
                word.append(ch); // build the current word
            } else {
                if (word.length() > 0) { // word finished
                    if (result.length() > 0) {
                        result.insert(0, " "); // add space between words
                    }
                    result.insert(0, word);
                    word.setLength(0); // reset word
                }
            }
        }

        // Append the last word if exists
        if (word.length() > 0) {
            if (result.length() > 0) result.insert(0, " ");
            result.insert(0, word);
        }

        return result.toString();
    }

    // Main method for testing
    public static void main(String[] args) {
        ReverseWordsInAString151 sol = new ReverseWordsInAString151();

        String s1 = "the sky is blue";
        String s2 = "  hello world  ";
        String s3 = "a good   example";

        System.out.println("Original: \"" + s1 + "\" | Reversed: \"" + sol.reverseWords(s1) + "\"");
        System.out.println("Original: \"" + s2 + "\" | Reversed: \"" + sol.reverseWords(s2) + "\"");
        System.out.println("Original: \"" + s3 + "\" | Reversed: \"" + sol.reverseWords(s3) + "\"");
    }
}
