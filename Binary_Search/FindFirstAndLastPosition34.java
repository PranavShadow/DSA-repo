package Binary_Search;
import java.util.Arrays;

public class FindFirstAndLastPosition34 {

    public int[] searchRange(int[] nums, int target) {
        int first = checkBound(nums, target, true);
        int last = checkBound(nums, target, false);
        return new int[] {first, last};
    }

    private int checkBound(int[] nums, int target, boolean isFirst){
        int front = 0, last = nums.length - 1, bound = -1;

        while(front <= last){
            int mid = front + (last - front) / 2; // safer than (front+last)/2
            if(nums[mid] == target){
                bound = mid;
                if(isFirst)
                    last = mid - 1; // move left for first occurrence
                else
                    front = mid + 1; // move right for last occurrence
            } else if (nums[mid] < target)
                front = mid + 1;
            else
                last = mid - 1;
        } 
        return bound;
    }

    // Main method to test
    public static void main(String[] args) {
        FindFirstAndLastPosition34 sol = new FindFirstAndLastPosition34();

        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        System.out.println("Range of " + target + ": " + Arrays.toString(sol.searchRange(nums, target))); // [3, 4]

        target = 6;
        System.out.println("Range of " + target + ": " + Arrays.toString(sol.searchRange(nums, target))); // [-1, -1]

        target = 5;
        System.out.println("Range of " + target + ": " + Arrays.toString(sol.searchRange(nums, target))); // [0, 0]
    }
}
