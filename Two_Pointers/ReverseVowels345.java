package Two_Pointers;
public class ReverseVowels345 {

    static class Solution {
        public String reverseVowels(String s) {
            int left = 0, right = s.length() - 1;
            StringBuilder sb = new StringBuilder(s);
            
            while (left < right) {
                // Move left to next vowel
                while (left < right && "aeiouAEIOU".indexOf(sb.charAt(left)) == -1) left++;
                // Move right to previous vowel
                while (left < right && "aeiouAEIOU".indexOf(sb.charAt(right)) == -1) right--;
                
                // Swap vowels
                char temp = sb.charAt(left);
                sb.setCharAt(left, sb.charAt(right));
                sb.setCharAt(right, temp);
                
                left++;
                right--;
            }
            
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        String input = "hello";
        String result = sol.reverseVowels(input);

        System.out.println("Original String: " + input);
        System.out.println("Reversed Vowels: " + result);
    }
}
