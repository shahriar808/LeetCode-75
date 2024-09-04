class Solution {
    public String decodeString(String s) {
     Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stackSB = new Stack<>();
        StringBuilder res = new StringBuilder();
        int n = 0;
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                n = n * 10 + c - '0';
            } else if (c == '[') {
                countStack.push(n);
                n = 0;
                stackSB.push(res);
                res = new StringBuilder();
            } else if (c == ']') {
                int n1 = countStack.pop();
                StringBuilder sb = res;
                res = stackSB.pop();
                for (int i = 0; i < n1; i++) {
                    res.append(sb);
                }
            }else {
                res.append(c);
            }
        }
        return res.toString();
    }
}