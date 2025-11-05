package Stack;
import java.util.Stack;

public class RemoveDuplicatesStack1047 {

    public static String removeDuplicates(String s) {
        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            // Remove duplicate if top of stack equals current character
            if (!stack.isEmpty() && stack.peek() == ch) {
                stack.pop();
            } else {
                stack.push(ch); // Otherwise push character
            }
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
        String[] tests = {"abbaca", "azxxzy", "aabbcc", "PRANAV", "GUPTA"};

        for (String s : tests) {
            System.out.println(s + " -> " + removeDuplicates(s));
        }
    }
}
