public class SubarrayAfterDeletingOne {
    public int longestSubarray(int[] nums) {
        int i = 0, j = 0;
        int k = 1;
        while (i < nums.length) {
            if (nums[i] == 0) k--;
            if (k < 0) {
                if (nums[j] == 0) k++;
                j++;
            }
            i++;
        }
        return i - j-1;
    }
    public static void main(String[] args) {
        SubarrayAfterDeletingOne subarray = new SubarrayAfterDeletingOne();
        System.out.println(subarray.longestSubarray(new int[]{1,1,1}));
    }
}
