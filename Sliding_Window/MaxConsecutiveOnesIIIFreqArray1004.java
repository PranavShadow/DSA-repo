package Sliding_Window;

public class MaxConsecutiveOnesIIIFreqArray1004 {
    public int longestOnes(int[] nums, int k) {
        int left = 0, right, mostFreq = 0, maxLen = 0;
        int freq[] = new int[2]; 

        for (right = 0; right < nums.length; right++) {
            freq[nums[right]]++;
            mostFreq = Math.max(mostFreq, freq[1]);

            while ((right - left + 1) - mostFreq > k) {
                freq[nums[left]]--;
                left++;
            }

            maxLen = Math.max(maxLen, right - left + 1);
        }

        return maxLen;
    }

    // Main method to run the program
    public static void main(String[] args) {
        MaxConsecutiveOnesIIIFreqArray1004 sol = new MaxConsecutiveOnesIIIFreqArray1004();
        int[] nums = {1,1,0,0,1,0,1,1,1,0,1};
        int k = 2;
        int result = sol.longestOnes(nums, k);
        System.out.println("Longest subarray: " + result);
    }
}
