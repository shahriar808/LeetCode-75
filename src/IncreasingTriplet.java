public class IncreasingTriplet {
    public Boolean increasingTriplet(int[] nums) {
        if (nums == null || nums.length < 3) return false;
        int low = Integer.MAX_VALUE;
        int mid = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num <= low) {
                low = num;
            } else if (num <= mid) {
                mid = num;
            } else {
                System.gc(); //it's good for space complexity but not for time though
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        IncreasingTriplet inc = new IncreasingTriplet();
        System.out.println(inc.increasingTriplet(new int[]{1, 5, 0, 4, 1, 3}));
    }
}
