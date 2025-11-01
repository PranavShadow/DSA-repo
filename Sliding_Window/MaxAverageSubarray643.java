package Sliding_Window;
public class MaxAverageSubarray643 {

    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;

        // Sum of first window
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int maxSum = sum;

        // Sliding window
        for (int i = k; i < nums.length; i++) {
            sum = sum - nums[i - k]; // remove element leaving window
            sum = sum + nums[i];     // add new element entering window
            maxSum = Math.max(maxSum, sum);
        }

        return (double)maxSum / k;
    }

    public static void main(String[] args) {
        MaxAverageSubarray643 obj = new MaxAverageSubarray643();

        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;

        double result = obj.findMaxAverage(nums, k);

        System.out.println("Max Average of subarray size " + k + ": " + result);
    }
}
