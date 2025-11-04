package Kadane_Algorithm;
public class MaximumSubarray53 {

    // LeetCode function
    public int maxSubArray(int[] nums) {
        int currSum = nums[0], maxSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currSum = Math.max(nums[i], currSum + nums[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }

    // Main for testing in VS Code
    public static void main(String[] args) {
        MaximumSubarray53 obj = new MaximumSubarray53();

        // Example array
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int result = obj.maxSubArray(nums);
        System.out.println("Maximum Subarray Sum: " + result);
    }
}
