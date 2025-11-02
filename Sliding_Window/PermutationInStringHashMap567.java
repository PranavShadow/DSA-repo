package Sliding_Window;
import java.util.*;

public class PermutationInStringHashMap567 {

    public static boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : s1.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        HashMap<Character, Integer> window = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char ch = s2.charAt(i);
            window.put(ch, window.getOrDefault(ch, 0) + 1);
        }

        if (window.equals(map)) {
            return true;
        }

        for (int i = s1.length(); i < s2.length(); i++) {
            char newChar = s2.charAt(i);
            char oldChar = s2.charAt(i - s1.length());

            window.put(newChar, window.getOrDefault(newChar, 0) + 1);

            if (window.get(oldChar) == 1) {
                window.remove(oldChar);
            } else {
                window.put(oldChar, window.get(oldChar) - 1);
            }

            if (window.equals(map)) {
                return true;
            }
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
