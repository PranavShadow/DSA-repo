package Binary_Search;
public class FindPeakElement162 {

    public static int findPeakElement(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            // If mid element is greater than the next one,
            // the peak lies on the left side (including mid)
            if (nums[mid] > nums[mid + 1]) {
                right = mid;
            } 
            // Otherwise, the peak lies on the right side
            else {
                left = mid + 1;
            }
        }

        // When left == right, we have found a peak
        return left;
    }

    // Main method for testing
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        int peakIndex = findPeakElement(nums);
        System.out.println("Peak Element Index: " + peakIndex);
        System.out.println("Peak Element Value: " + nums[peakIndex]);
    }
}
