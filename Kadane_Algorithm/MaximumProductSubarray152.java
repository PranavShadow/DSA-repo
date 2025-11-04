package Kadane_Algorithm;
public class MaximumProductSubarray152 {

    public int maxProduct(int[] nums) {
        int currMin = nums[0], currMax = nums[0], maxProduct = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int temp = currMax;
            currMax = Math.max(nums[i], Math.max(nums[i] * currMax, nums[i] * currMin));
            currMin = Math.min(nums[i], Math.min(nums[i] * temp, nums[i] * currMin));
            maxProduct = Math.max(maxProduct, currMax);
        }
        return maxProduct;
    }

    // Example to test
    public static void main(String[] args) {
        MaximumProductSubarray152 obj = new MaximumProductSubarray152();
        int[] nums = {2, 3, -2, 4};
        System.out.println(obj.maxProduct(nums)); // Output: 6
    }
}
