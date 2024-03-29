class Solution {
    public boolean isValid(String s) {
        Stack<Character> queue = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (i == 0 || queue.size() == 0) {
                queue.push(s.charAt(i));
                continue;
            }

            if (s.charAt(i) == ')' && queue.peek() == '('
                    || s.charAt(i) == '}' && queue.peek() == '{'
                    || s.charAt(i) == ']' && queue.peek() == '[') {
                queue.pop();
            } else {
                queue.push(s.charAt(i));
            }
        }
        return queue.size() == 0;
    }
}