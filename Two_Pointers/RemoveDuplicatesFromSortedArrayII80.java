package Two_Pointers;
public class RemoveDuplicatesFromSortedArrayII80 {

    // LeetCode method
    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) return nums.length;

        int j = 2; // first 2 are always allowed

        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[j - 2]) {
                nums[j] = nums[i];
                j++;
            }
        }

        return j;
    }

    // Main method to test in VS Code
    public static void main(String[] args) {
        RemoveDuplicatesFromSortedArrayII80 obj = new RemoveDuplicatesFromSortedArrayII80();

        int[] nums = {1, 1, 1, 2, 2, 3};

        int k = obj.removeDuplicates(nums);

        System.out.println("k = " + k);
        System.out.print("Modified array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
