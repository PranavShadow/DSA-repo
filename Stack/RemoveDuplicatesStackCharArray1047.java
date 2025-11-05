package Stack;
public class RemoveDuplicatesStackCharArray1047 {

    public static String removeDuplicates(String s) {
        char[] stack = new char[s.length()];
        int index = -1; // top of the stack

        for (char ch : s.toCharArray()) {
            if (index >= 0 && ch == stack[index]) {
                index--; // pop the duplicate
            } else {
                stack[++index] = ch; // push character
            }
        }

        return new String(stack, 0, index + 1);
    }

    // Main method for testing
    public static void main(String[] args) {
        String[] tests = {"abbaca", "azxxzy", "aabbcc", "a", "aa", "PRANAV"};

        for (String s : tests) {
            System.out.println(s + " -> " + removeDuplicates(s));
        }
    }
}
