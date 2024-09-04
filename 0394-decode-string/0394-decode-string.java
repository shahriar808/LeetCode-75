class Solution {
    public String decodeString(String s) {
      Stack<Integer> countStack = new Stack<>();
      Stack<String> resultStack = new Stack<>();
      String res = "";
      int index = 0;
      while (index < s.length()) {
          if (Character.isDigit(s.charAt(index))) {
              int count = 0;
              while (Character.isDigit(s.charAt(index))) {
                  count = count * 10 + (s.charAt(index) - '0');
                  index++;
              }
              countStack.push(count);
          } else if (s.charAt(index) == '[') {
              resultStack.push(res);
              res = "";
              index++;
          }
          else if (s.charAt(index) == ']') {
              StringBuilder sb = new StringBuilder(resultStack.pop());
              int count = countStack.pop();
              while (count > 0) {
                  sb.append(res);
                  count--;
              }
              res = sb.toString();
              index++;
          }
          else {
              res = res + s.charAt(index);
              index++;
          }
      }
      return res;
    }
}