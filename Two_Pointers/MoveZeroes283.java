package Two_Pointers;

public class MoveZeroes283 {

    public void moveZeroes(int[] nums) {
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            if (nums[right] != 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
            }
        }
    }

    public static void main(String[] args) {

        int[] nums = {0, 1, 0, 3, 12, 0};

        MoveZeroes283 obj = new MoveZeroes283();
        obj.moveZeroes(nums);

        // print result
        for (int n : nums) {
            System.out.print(n + " ");
        }
    }
}
