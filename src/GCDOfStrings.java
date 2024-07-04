public class GCDOfStrings {
    public String gcdOfStrings(String str1, String str2) {
        String bigger = str1.length() > str2.length() ? str1 : str2;
        String smaller = str1.length() > str2.length() ? str2 : str1;
        if (bigger.equals(smaller)) return smaller;
        if (!bigger.startsWith(smaller)) return "";
        return gcdOfStrings(bigger.substring(smaller.length()),smaller);

    }

    public static void main(String[] args) {
        GCDOfStrings gcdOfStrings = new GCDOfStrings();
        System.out.println(gcdOfStrings.gcdOfStrings("ab", "abcd"));
    }
}
