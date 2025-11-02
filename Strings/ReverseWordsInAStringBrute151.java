package Strings;
public class ReverseWordsInAStringBrute151 {

    // LeetCode method
    public String reverseWords(String s) {
        String word = "", sentence = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                word = word + ch;
            } else {
                if(word.length() > 0){
                sentence = word + " " + sentence;
                word = "";
                }
            }
        }
        return (word + " " + sentence).trim();
    }

    // Main method for testing
    public static void main(String[] args) {
        ReverseWordsInAStringBrute151 sol = new ReverseWordsInAStringBrute151();

        String test1 = "the sky is blue";
        String test2 = "  hello world  ";
        String test3 = "a good   example";

        System.out.println("Original: \"" + test1 + "\" | Reversed: \"" + sol.reverseWords(test1) + "\"");
        System.out.println("Original: \"" + test2 + "\" | Reversed: \"" + sol.reverseWords(test2) + "\"");
        System.out.println("Original: \"" + test3 + "\" | Reversed: \"" + sol.reverseWords(test3) + "\"");
    }
}
