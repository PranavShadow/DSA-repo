package Sliding_Window;
public class MaxConsecutiveOnesIIIFreqArrayZeroCount1004 {

    // Method using sliding window and zeros count
    public int longestOnes(int[] nums, int k) {
        int left = 0, right, zerosCount = 0, maxLen = 0;

        for (right = 0; right < nums.length; right++) {
            if (nums[right] == 0) zerosCount++;

            while (zerosCount > k) {
                if (nums[left] == 0) zerosCount--;
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    // Main method with hardcoded example
    public static void main(String[] args) {
        MaxConsecutiveOnesIIIFreqArrayZeroCount1004 solution = new MaxConsecutiveOnesIIIFreqArrayZeroCount1004();

        // Example array and k
        int[] nums = {1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 1};
        int k = 2;

        int result = solution.longestOnes(nums, k);

        System.out.println("Longest subarray with at most " + k + " flips: " + result);
    }
}
