package Prefix_Sum;
import java.util.HashMap;

public class SubarraySumsDivisibleByKHashMap974 {

    public static int subarraysDivByK(int[] nums, int k) {
        int prefixSum = 0, count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, 1);

        for (int num : nums) {
            prefixSum += num;
            int mod = prefixSum % k;

            if (mod < 0) mod += k;

            if (map.containsKey(mod)) {
                count += map.get(mod);
                map.put(mod, map.get(mod) + 1);
            } else {
                map.put(mod, 1);
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 0, -2, -3, 1};
        int k = 5;

        System.out.println(subarraysDivByK(nums, k)); 
        // Expected Output: 7
    }
}
