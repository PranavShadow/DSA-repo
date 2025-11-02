package Sliding_Window;
import java.util.*;

public class PermutationInStringFreqArray567 {

    public static boolean checkInclusion(String s1, String s2) {
        int k = s1.length(), n = s2.length();
        if (k > n) return false;

        int[] freq = new int[26];
        int[] window = new int[26];

        // Fill frequency for s1
        for (char c : s1.toCharArray()) {
            freq[c - 'a']++;
        }

        // Initialize first window
        for (int i = 0; i < k; i++) {
            window[s2.charAt(i) - 'a']++;
        }

        if (Arrays.equals(freq, window)) return true;

        // Slide the window
        for (int i = k; i < n; i++) {
            char newChar = s2.charAt(i);
            char oldChar = s2.charAt(i - k);

            window[newChar - 'a']++;
            window[oldChar - 'a']--;

            if (Arrays.equals(freq, window)) return true;
        }

        return false;
    }

    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";

        boolean result = checkInclusion(s1, s2);
        System.out.println(result); // Expected: true
    }
}
