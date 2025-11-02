package Sliding_Window;
public class LongestRepeatingCharacterReplacement424 {
    public int characterReplacement(String s, int k) {
        int right;
        int left = 0;
        int[] freq = new int[26];
        int maxFreq = 0;
        int res = 0;

        for (right = 0; right < s.length(); right++) {
            int idx = s.charAt(right) - 'A';
            freq[idx]++;
            maxFreq = Math.max(maxFreq, freq[idx]);

            while ((right - left + 1) - maxFreq > k) {
                freq[s.charAt(left) - 'A']--;
                left++;
            }

            res = Math.max(res, (right - left + 1));
        }

        return res;
    }

    // Test the program
    public static void main(String[] args) {
        LongestRepeatingCharacterReplacement424 obj = new LongestRepeatingCharacterReplacement424();
        String s = "AABABBA";
        int k = 1;
        System.out.println(obj.characterReplacement(s, k)); // Output should be 4
    }
}
