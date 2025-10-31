package Loops;
public class TwoSumBruteForce {

    public int[] twoSum(int[] nums, int target) {
        for (int j = 1; j < nums.length; j++) {
            for (int k = j; k < nums.length; k++) {
                int a = k - j;
                if (nums[a] + nums[k] == target) {
                    return new int[]{a, k};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        TwoSumBruteForce obj = new TwoSumBruteForce();
        
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = obj.twoSum(nums, target);

        if (result != null) {
            System.out.println("Indices: [" + result[0] + ", " + result[1] + "]");
        } else {
            System.out.println("No pair found");
        }
    }
}
