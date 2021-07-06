package linearDataStructures.stack;

import java.util.Stack;

public class ReverseString {
    public static void main(String[] args) {
        String str = "abcd";
        System.out.println(reverse(str));
    }

    private static String reverse(String input){
        if (input == null)
            throw new IllegalArgumentException();

        Stack<Character> stack = new Stack<>();
        for (char ch : input.toCharArray())
            stack.push(ch);

        StringBuilder reversed = new StringBuilder();
        while (!stack.empty())
            reversed.append(stack.pop());

        return reversed.toString();
    }
}
