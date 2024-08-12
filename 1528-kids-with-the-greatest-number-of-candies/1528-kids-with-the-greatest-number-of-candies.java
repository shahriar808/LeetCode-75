class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
         List<Boolean> result = new ArrayList<Boolean>();
        int maxCandies = candies[0];
        for(int i = 0; i < candies.length; i++){
            if(candies[i] > maxCandies){
                maxCandies = candies[i];
            }
        }
        for(int i = 0; i < candies.length; i++){
            if((candies[i] + extraCandies) >= maxCandies){
                result.add(true);
            }
            else result.add(false);
        }
        return result;
    }
}