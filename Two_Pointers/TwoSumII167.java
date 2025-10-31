package Two_Pointers;

import java.util.Arrays;

public class TwoSumII167 {

    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;

        while (left <= right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) break;
            else if (sum < target) left++;
            else right--;
        }
        return new int[]{left + 1, right + 1}; 
    }

    public static void main(String[] args) {
        TwoSumII167 obj = new TwoSumII167();

        int[] numbers = {2, 7, 11, 15};
        int target = 9;

        int[] result = obj.twoSum(numbers, target);

        System.out.println("Indices: " + Arrays.toString(result));
    }
}
