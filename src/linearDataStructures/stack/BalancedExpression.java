package linearDataStructures.stack;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class BalancedExpression {

    private static final List<Character> leftBrackets = Arrays.asList('(', '<', '[', '{');
    private static final List<Character> rightBrackets = Arrays.asList(')', '>', ']', '}');

    public static void main(String[] args) {
        String str = "(1 + 2)";
        System.out.println(isBalanced(str));
    }

    public static boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray()) {
            if (isLeftBracket(ch))
                stack.push(ch);

            if (isRightBracket(ch)) {
                if (stack.empty()) return false;

                var top = stack.pop();
                if (bracketsMatch(top, ch)) continue;
            }
        }

        return stack.empty();
    }

    private static boolean isLeftBracket(char ch) {
        return leftBrackets.contains(ch);
    }

    private static boolean isRightBracket(char ch) {
        return rightBrackets.contains(ch);
    }

    private static boolean bracketsMatch(char left, char right) {
        return leftBrackets.indexOf(left) == rightBrackets.indexOf(right);
    }
}
