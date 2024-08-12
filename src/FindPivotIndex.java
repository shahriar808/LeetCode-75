public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int leftSum = 0;
        int rightSum = 0;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        for (int i = 0; i < nums.length; i++) {
            rightSum = sum - nums[i] - leftSum;
            if (leftSum == rightSum) return i;
            leftSum += nums[i];
        }
        return -1;
    }
    public static void main(String[] args) {
        FindPivotIndex findPivotIndex = new FindPivotIndex();
        System.out.println(findPivotIndex.pivotIndex(new int[]{1,-1,2}));
    }
}
