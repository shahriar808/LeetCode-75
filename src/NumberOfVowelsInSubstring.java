import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class NumberOfVowelsInSubstring {
    public int maxVowels(String s, int k) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        int count = 0;
        for(int i = 0; i < k; i++){
            if(vowels.contains(s.charAt(i)))
                count++;
        }
        int maxCount = count;
        for(int i = k; i < s.length(); i++){
            if(vowels.contains(s.charAt(i))){
                count++;
            }

            if(vowels.contains(s.charAt(i-k)))
                count--;
            maxCount = Math.max(maxCount, count);
        }
        return maxCount;
    }
    public static void main(String[] args) {
        NumberOfVowelsInSubstring obj = new NumberOfVowelsInSubstring();
        System.out.println(obj.maxVowels("aeiou", 2));
    }
}
