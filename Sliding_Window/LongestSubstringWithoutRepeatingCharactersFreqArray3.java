package Sliding_Window;
public class LongestSubstringWithoutRepeatingCharactersFreqArray3 {

    public int lengthOfLongestSubstring(String s) {
        int[] freq = new int[128]; // ASCII frequency array
        int left = 0, maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            char ch = s.charAt(right);
            freq[ch]++;

            // If duplicate exists, shrink window
            while (freq[ch] > 1) {
                freq[s.charAt(left)]--;
                left++;
            }

            // Update max length
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharactersFreqArray3 sol = 
            new LongestSubstringWithoutRepeatingCharactersFreqArray3();
        
        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";
        
        System.out.println(sol.lengthOfLongestSubstring(s1)); // Output: 3
        System.out.println(sol.lengthOfLongestSubstring(s2)); // Output: 1
        System.out.println(sol.lengthOfLongestSubstring(s3)); // Output: 3
    }
}
