class Solution {
    public boolean increasingTriplet(int[] nums) {
        if (nums == null || nums.length < 3) return false;
        int low = Integer.MAX_VALUE, mid = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num <= low) {
                low = num;
            } else if (num <= mid) {
                mid = num;
            } else {
               
                return true;
            }
        }
        return false;
    }
}