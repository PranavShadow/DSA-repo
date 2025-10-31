package Two_Pointers;

public class ContainerWithMostWater11 {

    public int maxArea(int[] height) {
        int max_area = 0, left = 0, right = height.length - 1;

        while (left <= right) {
            int area = Math.min(height[left], height[right]) * (right - left);
            if (area > max_area)
                max_area = area;

            if (height[left] < height[right])
                left++;
            else
                right--;
        }
        return max_area;
    }

    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7}; 

        ContainerWithMostWater11 obj = new ContainerWithMostWater11();
        int result = obj.maxArea(height);

        System.out.println("Max Water Container Area: " + result);
    }
}
