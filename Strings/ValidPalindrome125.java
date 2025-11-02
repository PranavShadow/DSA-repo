package Strings;
public class ValidPalindrome125 {
    public boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;

        while (left <= right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left)))
                left++;
            while (left < right && !Character.isLetterOrDigit(s.charAt(right)))
                right--;

            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Main method to test the code
    public static void main(String[] args) {
        ValidPalindrome125 sol = new ValidPalindrome125();

        String test1 = "A man, a plan, a canal: Panama";
        String test2 = "race a car";
        String test3 = "0P";

        System.out.println("\"" + test1 + "\" is palindrome? " + sol.isPalindrome(test1));
        System.out.println("\"" + test2 + "\" is palindrome? " + sol.isPalindrome(test2));
        System.out.println("\"" + test3 + "\" is palindrome? " + sol.isPalindrome(test3));
    }
}
