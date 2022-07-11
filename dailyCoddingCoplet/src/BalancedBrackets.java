import java.util.Stack;

public class BalancedBrackets {
    public boolean balancedBrackets(String str) {
        // TODO:
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            switch (c) {
                case '(':
                case '{':
                case '[':
                    stack.push(c);
                    break;
                case ')':
                    if (stack.size() <= 0) return false;
                    else if (stack.pop() != '(') return false;
                    break;
                case '}':
                    if (stack.size() <= 0) return false;
                    else if (stack.pop() != '{') return false;
                    break;
                case ']':
                    if (stack.size() <= 0) return false;
                    else if (stack.pop() != '[') return false;
                    break;
                default:
                    break;
            }
        }
        if (stack.size() > 0) return false;
        return true;
    }
}
