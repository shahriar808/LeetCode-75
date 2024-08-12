public class MaxConsecutiveOnesIII {
    public int longestOnes(int[] nums, int k) {
        int i = 0, j = 0;
        while (i < nums.length) {
            if (nums[i] == 0) k--;
            if (k < 0){
                if (nums[j] == 0) k++;
                j++;
            }
            i++;
        }
        return i - j;
    }

    public static void main(String[] args) {
        MaxConsecutiveOnesIII maxConsecutiveOnesIII  = new MaxConsecutiveOnesIII();
        System.out.println(maxConsecutiveOnesIII.longestOnes(new int[]{1,1,1,0,0,0,1,1,1,1,0},2));
    }
}
