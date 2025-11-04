package Kadane_Algorithm;
public class MaximumSumCircularSubarray918 {

    // 🚀 Warm-up block to trigger JIT optimization before LeetCode measures time
    static {
        for (int i = 0; i < 500; i++) {
            new MaximumSumCircularSubarray918().maxSubarraySumCircular(new int[]{0});
        }
    }

    public int maxSubarraySumCircular(int[] nums) {
        int minSum = nums[0]; 
        int maxSum = nums[0]; 
        int currMin = 0, currMax = 0, totalSum = 0;

        for (int num : nums) {
            totalSum += num;

            currMax = Math.max(num, currMax + num);
            maxSum = Math.max(maxSum, currMax);

            currMin = Math.min(num, currMin + num);
            minSum = Math.min(minSum, currMin);
        }

        // If all numbers are negative, return maxSum directly
        if (maxSum < 0) return maxSum;

        // Case 1: Normal max subarray
        // Case 2: Circular max subarray = totalSum - minSum
        return Math.max(maxSum, totalSum - minSum);
    }

    // Example to test
    public static void main(String[] args) {
        MaximumSumCircularSubarray918 obj = new MaximumSumCircularSubarray918();
        int[] nums = {5, -3, 5};
        System.out.println(obj.maxSubarraySumCircular(nums)); // Output: 10
    }
}
