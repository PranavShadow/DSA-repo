package Stack;
import java.util.Stack;

public class LongestValidParentheses32 {

    // Static block calling method multiple times (for demonstration / testing)
    static {
        for (int i = 0; i < 300; i++) {
            new LongestValidParentheses32().longestValidParentheses("PRANAV");
            new LongestValidParentheses32().longestValidParentheses("()()()");
        }
    }

    public int longestValidParentheses(String s) {
        int maxLen = 0;
        Stack<Integer> stack = new Stack<>();
        stack.push(-1); // Base index for valid substring calculation

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(') {
                stack.push(i); // Push index of '('
            } else {
                stack.pop(); // Pop matching '('
                if (stack.isEmpty()) {
                    stack.push(i); // New base index
                } else {
                    maxLen = Math.max(maxLen, i - stack.peek()); // Update max length
                }
            }
        }

        return maxLen;
    }

    // Main method for testing examples
    public static void main(String[] args) {
        LongestValidParentheses32 sol = new LongestValidParentheses32();

        String[] tests = {"(()", ")()())", "", "((()))", "()()())(()"};

        for (String s : tests) {
            System.out.println("\"" + s + "\" -> " + sol.longestValidParentheses(s));
        }
    }
}
