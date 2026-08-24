class Solution {
    public boolean isValid(String s) {
        String stack = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(' || c == '[' || c == '{') {
                stack += c;
            } else {
                if (stack.length() == 0) return false;

                char top = stack.charAt(stack.length() - 1);

                if ((c == ')' && top != '(') ||
                    (c == ']' && top != '[') ||
                    (c == '}' && top != '{')) {
                    return false;
                }

                stack = stack.substring(0, stack.length() - 1);
            }
        }

        return stack.length() == 0;
    }
}