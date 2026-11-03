class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();

        for (char c : s.toCharArray()) {
            if (c == '{' || c == '[' || c == '(') {
                stack.push(c);
                continue;
            } else {
                if (stack.isEmpty())
                    return false;

                char top = stack.peek();
                if (c == '}' && top != '{') {
                    return false;
                } else if (c == ')' && top != '(') {
                    return false;
                } else if (c == ']' && top != '[') {
                    return false;
                }
                stack.pop();
            }
        }

        if (!stack.isEmpty()) {
            return false;
        }

        return true;
    }
}
