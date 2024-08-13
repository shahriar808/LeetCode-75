class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
             int count = 0;
             if (n==0) return true;
        if (flowerbed.length<2){
             if (flowerbed[0]==0){
                count++;
            }
            return count >= n;
        }
        if (flowerbed.length<3){
            if (flowerbed[0]==1 || flowerbed[1]==1){
                return count >= n;
            }
            else {
                count++;
                return count >= n;
                }
        }
        if (flowerbed[0] == 0 && flowerbed[1] == 0)
            count++;
        if (flowerbed[flowerbed.length-1] == 0 && flowerbed[flowerbed.length-2] == 0)
            count++;
        for (int i = 2; i < flowerbed.length-2; i++) {
            if (flowerbed[i - 1] == 0 && flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
                count++;
                i++;
            }
        }
        return count >= n;

}
}