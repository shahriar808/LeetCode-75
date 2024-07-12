public class MaxArea {
    public int maxArea(int[] height) {
        if (height == null || height.length < 2) {
            return 0;
        }
        int max = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            int minHight = Math.min(height[left], height[right]);
            max = Math.max(max, (right - left) * minHight);
            while(left<right && minHight>=height[left])
            {
                left++;
            }

            while(left<right && minHight>=height[right])
            {
                right--;
            }

        }
        return max;
    }

    public static void main(String[] args) {

    }
}
