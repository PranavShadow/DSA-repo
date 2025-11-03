package Prefix_Sum;
public class SubarraySumsDivisibleByKFreqArray974 {

    public static int subarraysDivByK(int[] nums, int k) {
        int[] map = new int[k];
        int sumRem = 0;
        int answer = 0;

        map[0] = 1; // remainder 0 already counted once

        for(int i = 0; i < nums.length; i++){
            sumRem += nums[i];
            sumRem = sumRem % k;

            if(sumRem < 0){
                sumRem += k;
            }

            answer += map[sumRem];
            map[sumRem]++;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {4, 5, 0, -2, -3, 1};
        int k = 5;

        System.out.println(subarraysDivByK(nums, k));
        // Expected Output: 7
    }
}
