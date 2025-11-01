package Arrays;
import java.util.Arrays;

public class MajorityElement169 {

    public int majorityElement(int[] nums) {
        int key = nums[0];
        int count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                key = nums[i];
                count = 1;
            } else if (nums[i] == key) {
                count++;
            } else {
                count--;
            }
        }
        return key;
    }

    public static void main(String[] args) {
        MajorityElement169 obj = new MajorityElement169();

        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        int majority = obj.majorityElement(nums);

        System.out.println("Array: " + Arrays.toString(nums));
        System.out.println("Majority element: " + majority);
    }
}
