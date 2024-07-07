public class ReverseWords {
    public String reverseWords(String s) {
        String[] str = s.trim().split("\\s+");
        StringBuilder out = new StringBuilder();
        for (int i = str.length - 1; i > 0; i--) {
            out.append(str[i]).append(" ");
        }
        out.append(str[0]);
        return out.toString();
    }
    public static void main(String[] args) {
        ReverseWords rw = new ReverseWords();
        System.out.println(rw.reverseWords("Hello World"));
    }
}
