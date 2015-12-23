import java.util.Stack;

public class ValidParentheses {
    /*
     * Given a string containing just the characters '(', ')', '{', '}', '[' and ']', 
     * determine if the input string is valid.
     * The brackets must close in the correct order, "()" and "()[]{}" 
     * are all valid but "(]" and "([)]" are not.
     */
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        stack.push(s.charAt(0));
        for (int i = 1; i < s.length(); i += 1) {
            char c = s.charAt(i);
            if (c == ')' || c == '}' || c == ']') {
                if (stack.empty()) {
                    return false;
                }
                char open = stack.pop();
                if (c == ')' && open != '(') return false;
                if (c == '}' && open != '{') return false;
                if (c == ']' && open != '[') return false;
                continue;
            } else {
                stack.push(c);
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
        System.out.println(isValid("([)]"));
    }
}


