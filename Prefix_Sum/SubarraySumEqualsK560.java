package Prefix_Sum;
import java.util.HashMap;

public class SubarraySumEqualsK560 {

    public static int subarraySum(int[] nums, int k) {
        int prefixSum = 0, count = 0;
        HashMap<Integer, Integer> prefixSumFreq = new HashMap<>();

        prefixSumFreq.put(0, 1);

        for (int num : nums) {
            prefixSum += num;

            if (prefixSumFreq.containsKey(prefixSum - k)) {
                count += prefixSumFreq.get(prefixSum - k);
            }

            prefixSumFreq.put(prefixSum, prefixSumFreq.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3};
        int k = 3;

        System.out.println(subarraySum(nums, k)); // Output: 2
    }
}
