import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MaximumAverageSubarrayI {
    public double findMaxAverage(int[] nums, int k) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < k; i++) {
            currentSum += nums[i];
        }
        maxSum = currentSum;
        for (int i = k; i < nums.length; i++) {
            currentSum += nums[i];
            currentSum -= nums[i-k];
            maxSum = Math.max(maxSum, currentSum);
        }
        return (double) maxSum /k;
    }
    public static void main(String[] args) {
        MaximumAverageSubarrayI obj = new MaximumAverageSubarrayI();
        System.out.println(obj.findMaxAverage(new int[]{1,12,-5,-6,50,3}, 4));
    }
}
