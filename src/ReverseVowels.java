import java.util.HashSet;
import java.util.Set;

public class ReverseVowels {
    public String reverseVowels(String s) {
        Set<Character> vowels = new HashSet<Character>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        vowels.add('A');
        vowels.add('E');
        vowels.add('I');
        vowels.add('O');
        vowels.add('U');
        int left = 0;
        int right = s.length() - 1;
        char[] chars = s.toCharArray();
        while (right > left) {
            if (vowels.contains(chars[right]) && vowels.contains(chars[left])) {
                char temp = chars[left];
                chars[left] = chars[right];
                chars[right] = temp;
                left++;
                right--;
            }
            else if (!vowels.contains(chars[left]) && vowels.contains(chars[right])) {
                left++;
            }
            else if (vowels.contains(chars[left]) && !vowels.contains(chars[right])) {
                right--;
            }
            else {
                right--;
                left++;
            }
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        ReverseVowels rev = new ReverseVowels();
        System.out.println(rev.reverseVowels("hello"));
    }
}
