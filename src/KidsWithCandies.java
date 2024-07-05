import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies){
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
    public static void main(String[] args) {
        KidsWithCandies k = new KidsWithCandies();
        System.out.println(k.kidsWithCandies(new int[]{2,3,5,1,3}, 3));

    }
}
