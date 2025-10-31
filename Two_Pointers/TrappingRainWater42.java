package Two_Pointers;
public class TrappingRainWater42 {

    public int trap(int[] height) {
        int left=0, right=height.length -1, maxLeft = height[left] , maxRight = height[right], result=0;
        while (left < right) {
            if (maxLeft < maxRight) {
                left++;
                maxLeft = Math.max(maxLeft, height[left]);
                result += maxLeft - height[left];
            }
            else{
                right++;
                maxLeft = Math.max(maxLeft, height[right]);
                result += maxRight - height[right];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        TrappingRainWater42 obj = new TrappingRainWater42();

        int[] height = {4,2,0,3,2,5}; // Example input
        int ans = obj.trap(height);

        System.out.println("Trapped Water: " + ans);
    }
}
