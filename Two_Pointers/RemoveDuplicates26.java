package Two_Pointers;
import java.util.Arrays;

public class RemoveDuplicates26 {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int j = 1; // slow pointer
        for (int i = 1; i < nums.length; i++) { // fast pointer
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }

    public static void main(String[] args) {
        RemoveDuplicates26 obj = new RemoveDuplicates26();

        int[] nums = {1, 1, 2, 2, 3, 4, 4, 5};
        int newLength = obj.removeDuplicates(nums);

        System.out.println("New length: " + newLength);
        System.out.println("Array after removing duplicates: " + Arrays.toString(Arrays.copyOf(nums, newLength)));
    }
}
