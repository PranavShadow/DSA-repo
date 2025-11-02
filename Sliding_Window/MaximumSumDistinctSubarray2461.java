package Sliding_Window;
import java.util.HashMap;
public class MaximumSumDistinctSubarray2461{

    public static long maximumSubarraySum(int[] nums, int k) {
        long sum = 0, maxSum = 0;
        int left = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int right = 0; right < nums.length; right++) {
            int curr = nums[right];

            // remove duplicates by shrinking window
            while (map.containsKey(curr) && map.get(curr) > 0) {
                map.put(nums[left], map.get(nums[left]) - 1);
                sum -= nums[left];
                left++;
            }

            // add current element
            map.put(curr, map.getOrDefault(curr, 0) + 1);
            sum += curr;

            // window hit size k
            if (right - left + 1 == k) {
                maxSum = Math.max(sum, maxSum);

                // slide window
                map.put(nums[left], map.get(nums[left]) - 1);
                sum -= nums[left];
                left++;
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 5, 4, 2, 9, 9, 9};
        int k = 3;

        System.out.println(maximumSubarraySum(nums, k)); 
        // Expected output: 15 (subarray {5,4,6} or similar)
    }
}
