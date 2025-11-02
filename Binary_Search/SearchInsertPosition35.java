package Binary_Search;
public class SearchInsertPosition35 {

    public int searchInsert(int[] nums, int target) {
        int f = 0, l = nums.length - 1;
        while (f <= l) {
            int mid = f + (l - f) / 2; // safer than (f+l)/2
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] > target)
                l = mid - 1;
            else
                f = mid + 1;
        }
        return f; // correct insert position
    }

    // Main method to test
    public static void main(String[] args) {
        SearchInsertPosition35 sol = new SearchInsertPosition35();

        int[] nums = {1, 3, 5, 6};
        int target = 5;
        System.out.println("Insert position of " + target + " is: " + sol.searchInsert(nums, target));

        target = 2;
        System.out.println("Insert position of " + target + " is: " + sol.searchInsert(nums, target));

        target = 7;
        System.out.println("Insert position of " + target + " is: " + sol.searchInsert(nums, target));

        target = 0;
        System.out.println("Insert position of " + target + " is: " + sol.searchInsert(nums, target));
    }
}
