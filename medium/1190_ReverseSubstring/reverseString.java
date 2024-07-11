class Solution {
    public String reverseParentheses(String s) {
     Stack<Integer> str = new Stack<>();
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                str.push(result.length());
            } else if (c == ')') {
                int start = str.pop();
                String sub = result.substring(start);
                result.replace(start, result.length(), new StringBuilder(sub).reverse().toString());
            } else {
                result.append(c);
            }
        }
        
        return result.toString();
    }
}