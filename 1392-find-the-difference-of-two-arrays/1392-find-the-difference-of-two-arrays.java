class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        return Arrays.asList(getDifference(nums1, nums2), getDifference(nums2, nums1));
    }
    private List<Integer> getDifference(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int j : nums2) {
            set1.add(j);
        }
        for (int j : nums1) {
            if (!set1.contains(j)) {
                set2.add(j);
            }
        }
        return new ArrayList<>(set2);
    }
}