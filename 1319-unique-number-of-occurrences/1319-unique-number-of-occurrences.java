class Solution {
    public boolean uniqueOccurrences(int[] arr) {
         HashMap<Integer, Integer> numOccurrences = new HashMap<>();
        for(int num : arr){
            numOccurrences.put(num, numOccurrences.getOrDefault(num, 0) + 1);
        }
        HashSet<Integer> uniqueOccurrences = new HashSet<>(numOccurrences.values());
        return uniqueOccurrences.size() == numOccurrences.size();
    }
}