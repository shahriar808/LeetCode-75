public class FindTheHighestAltitude {
    public int largestAltitude(int[] gain) {
        int currentAltitude = 0;
        int maxAltitude = 0;
        for (int i = 0; i < gain.length - 1; i++) {
            currentAltitude += gain[i];
            maxAltitude = Math.max(maxAltitude, currentAltitude);
        }
        return maxAltitude;
    }

    public static void main(String[] args) {
        FindTheHighestAltitude fh = new FindTheHighestAltitude();
        System.out.println(fh.largestAltitude(new int[]{-5, 1, 5, 0, -7}));
    }
}
