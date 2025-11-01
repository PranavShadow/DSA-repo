package Sliding_Window;

import java.util.*;

public class FindAllAnagramsInAStringHash438 {

    public static List<Integer> findAnagrams(String s, String p) {
        int n = s.length();
        int k = p.length();
        List<Integer> result = new ArrayList<>();
        if (n < k) return result;

        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : p.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        HashMap<Character, Integer> window = new HashMap<>();
        for (int i = 0; i < k; i++) {
            char c = s.charAt(i);
            window.put(c, window.getOrDefault(c, 0) + 1);
        }

        if (window.equals(map)) {
            result.add(0);
        }

        for (int i = k; i < n; i++) {
            char newChar = s.charAt(i);
            char oldChar = s.charAt(i - k);

            window.put(newChar, window.getOrDefault(newChar, 0) + 1);

            if (window.get(oldChar) == 1) {
                window.remove(oldChar);
            } else {
                window.put(oldChar, window.get(oldChar) - 1);
            }

            if (window.equals(map)) {
                result.add(i - k + 1);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";

        List<Integer> result = findAnagrams(s, p);
        System.out.println(result); // Expected: [0, 6]
    }
}
