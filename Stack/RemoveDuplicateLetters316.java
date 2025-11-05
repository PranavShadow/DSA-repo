package Stack;
import java.util.Stack;

public class RemoveDuplicateLetters316 {

    public static String removeDuplicateLetters(String s) {
        int[] count = new int[26];       // Count of each character
        boolean[] used = new boolean[26]; // Track if character is in stack

        // Count occurrences of each character
        for (char ch : s.toCharArray()) {
            count[ch - 'a']++;
        }

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            int index = ch - 'a';
            count[index]--; // Decrement remaining count

            if (used[index]) continue; // Skip if already in stack

            // Remove characters that are greater than current and appear later
            while (!stack.isEmpty() && stack.peek() > ch && count[stack.peek() - 'a'] > 0) {
                used[stack.pop() - 'a'] = false;
            }

            stack.push(ch);
            used[index] = true;
        }

        // Build result string from stack
        StringBuilder sb = new StringBuilder();
        for (char ch : stack) {
            sb.append(ch);
        }

        return sb.toString();
    }

    // Main method for testing
    public static void main(String[] args) {
        String s1 = "bcabc";
        String s2 = "cbacdcbc";
        String s3 = "cdadabcc";

        System.out.println(s1 + " -> " + removeDuplicateLetters(s1)); // Output: "abc"
        System.out.println(s2 + " -> " + removeDuplicateLetters(s2)); // Output: "acdb"
        System.out.println(s3 + " -> " + removeDuplicateLetters(s3)); // Output: "adbc"
    }
}
