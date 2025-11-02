package Sliding_Window;import java.util.ArrayList;
import java.util.*;

public class SubstringConcatAllWords30 {

    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> result = new ArrayList<>();
        if (s == null || s.length() == 0 || words == null || words.length == 0) return result;

        int wordLen = words[0].length();
        int wordCount = words.length;

        // Count words
        Map<String, Integer> wordMap = new HashMap<>();
        for (String word : words) wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);

        // Check for each offset
        for (int i = 0; i < wordLen; i++) {
            int left = i, right = i;
            Map<String, Integer> currentMap = new HashMap<>();
            int count = 0;

            while (right + wordLen <= s.length()) {
                String word = s.substring(right, right + wordLen);
                right += wordLen;

                if (!wordMap.containsKey(word)) {
                    currentMap.clear();
                    count = 0;
                    left = right;
                } else {
                    currentMap.put(word, currentMap.getOrDefault(word, 0) + 1);
                    count++;

                    while (currentMap.get(word) > wordMap.get(word)) {
                        String leftWord = s.substring(left, left + wordLen);
                        currentMap.put(leftWord, currentMap.get(leftWord) - 1);
                        count--;
                        left += wordLen;
                    }

                    if (count == wordCount) result.add(left);
                }
            }
        }
        return result;
    }

    // Main method to test
    public static void main(String[] args) {
        SubstringConcatAllWords30 sol = new SubstringConcatAllWords30();
        String s = "barfoothefoobarman";
        String[] words = {"foo","bar"};

        List<Integer> indexes = sol.findSubstring(s, words);
        System.out.println("Starting indexes: " + indexes);
    }
}
