import java.util.Arrays;

public class MaxNumberOfSumPairs {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int left = 0;
        int right = nums.length - 1;
        int count = 0;
        while (left < right) {
            if(nums[left]+nums[right]==k){
                count++;
                left++;
                right--;
            }
            else if(nums[left]+nums[right]>k){
                right--;
            }
            else if(nums[left]+nums[right]<k){
                left++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        MaxNumberOfSumPairs obj = new MaxNumberOfSumPairs();
        System.out.println(obj.maxOperations(new int[]{1,2,3,4}, 5));
    }
}
