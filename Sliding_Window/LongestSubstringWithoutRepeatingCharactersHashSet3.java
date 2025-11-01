package Sliding_Window;
import java.util.*;
public class LongestSubstringWithoutRepeatingCharactersHashSet3 {

    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> seen = new HashSet<>();
        int left=0, maxLength=0;

        for(int right=0; right< s.length(); right++){
            while(seen.contains(s.charAt(right))){
                seen.remove(s.charAt(left));
                left++;
            }
            seen.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharactersHashSet3 sol = 
            new LongestSubstringWithoutRepeatingCharactersHashSet3();
        
        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";
        
        System.out.println(sol.lengthOfLongestSubstring(s1)); // Output: 3
        System.out.println(sol.lengthOfLongestSubstring(s2)); // Output: 1
        System.out.println(sol.lengthOfLongestSubstring(s3)); // Output: 3
    }
}
