public class IsSubsequence {
    public Boolean isSubsequence(String s, String t) {
        int i = 0, j = 0;
        int n = t.length();
        int m = s.length();
        char ss[] = s.toCharArray();
        char tt[] = t.toCharArray();

        if (m < 1)
            return true;

        while (i < n) {
            if (tt[i] == ss[j]) {
                j++;
            }
            i++;
            if (j == m)
                return true;
        }
        return false;

       /* if (s.isEmpty())    return true;
        int i = 0, j = 0;
        while (i < t.length() && j < s.length()) {
            if (392. Is Subsequence) {
                j++;
            }
            i++;
            if (j == s.length()) {
                return true;
            }
        }
        return false;*/
    }

    public static void main(String[] args) {
        IsSubsequence isSubsequence = new IsSubsequence();
        System.out.println(isSubsequence.isSubsequence("abc", "ahbgdc"));
    }
}
