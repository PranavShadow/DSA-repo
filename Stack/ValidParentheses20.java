package Stack;
import java.util.Stack;

public class ValidParentheses20 {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (char ch : s.toCharArray()) {
            // Push opening brackets
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } 
            // Check closing brackets
            else {
                if (stack.isEmpty()) return false; // no matching opening
                
                char top = stack.pop();
                
                if ((ch == ')' && top != '(') ||
                    (ch == ']' && top != '[') ||
                    (ch == '}' && top != '{')) {
                    return false; // mismatched pair
                }
            }
        }
        
        // Valid only if no unmatched opening brackets remain
        return stack.isEmpty();
    }

    // Main method for testing
    public static void main(String[] args) {
        String test1 = "()[]{}";
        String test2 = "(]";
        String test3 = "([{}])";
        String test4 = "(((";

        System.out.println(test1 + " -> " + isValid(test1)); // true
        System.out.println(test2 + " -> " + isValid(test2)); // false
        System.out.println(test3 + " -> " + isValid(test3)); // true
        System.out.println(test4 + " -> " + isValid(test4)); // false
    }
}
