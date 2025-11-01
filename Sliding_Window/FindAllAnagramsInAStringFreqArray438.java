
package Sliding_Window;
import java.util.*;

public class FindAllAnagramsInAStringFreqArray438 {
    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        if (s.length() < p.length()) return ans;

        int[] freq = new int[26];

        // fill freq for string p
        for (char c : p.toCharArray()) {
            freq[c - 'a']++;
        }

        int left = 0, right = 0, count = p.length();

        while (right < s.length()) {
            if (freq[s.charAt(right) - 'a'] > 0) {
                count--;
            }
            freq[s.charAt(right) - 'a']--;
            right++;

            if (count == 0) {
                ans.add(left);
            }

            // if window size == p length, shrink
            if (right - left == p.length()) {
                if (freq[s.charAt(left) - 'a'] >= 0) {
                    count++;
                }
                freq[s.charAt(left) - 'a']++;
                left++;
            }
        }
        return ans;
    }

    // ✅ main method to test in VS Code
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";

        List<Integer> result = findAnagrams(s, p);
        System.out.println(result);
    }
}
