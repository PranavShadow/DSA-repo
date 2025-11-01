package Sliding_Window;
public class MaxAverageSubarrayBrute643 {

    public double findMaxAverage(int[] nums, int k) {
        int maxSum=Integer.MIN_VALUE;
        for (int i = 0; i <= nums.length - k; i++) {
            int sum=0;
            for (int j = i; j < i+k; j++) {
                sum+=nums[j];
            }
            maxSum = Math.max(maxSum, sum);
        }
        return (double) maxSum/k;
        
    }

    public static void main(String[] args) {
        MaxAverageSubarrayBrute643 obj = new MaxAverageSubarrayBrute643();

        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;

        double result = obj.findMaxAverage(nums, k);

        System.out.println("Max Average of subarray size " + k + ": " + result);
    }
}
