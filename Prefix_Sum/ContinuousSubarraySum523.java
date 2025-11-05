package Prefix_Sum;
import java.util.HashMap;

public class ContinuousSubarraySum523 {

    public boolean checkSubarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int prefixsum = 0;

        map.put(0, -1); // To handle cases where subarray starts from index 0

        for (int i = 0; i < nums.length; i++) {
            prefixsum += nums[i];
            int remainder = prefixsum % k;

            if (map.containsKey(remainder)) {
                if (i - map.get(remainder) > 1) {
                    return true;
                }
            } else {
                map.put(remainder, i);
            }
        }
        return false;
    }

    // Example to test
    public static void main(String[] args) {
        ContinuousSubarraySum523 obj = new ContinuousSubarraySum523();
        int[] nums = {23, 2, 4, 6, 7};
        int k = 6;
        System.out.println(obj.checkSubarraySum(nums, k)); // Output: true
    }
}
