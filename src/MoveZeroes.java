public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int j = 0;
        int temp;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
    }
    public static void main(String[] args) {
        MoveZeroes m = new MoveZeroes();
        m.moveZeroes(new int[]{0, 1, 0, 3, 12});
    }
}
