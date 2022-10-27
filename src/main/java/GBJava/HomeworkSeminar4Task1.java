package GBJava;

import java.util.Stack;

public class HomeworkSeminar4Task1 {
    public static void main(String[] args) {
        System.out.println(isValid("()[]{}"));
    }

    public static boolean isValid(String s) {
        char[] charArray = s.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (char elem : charArray) {
            if (elem == '(') {
                stack.push(')');
            } else if (elem == '{') {
                stack.push('}');
            } else if (elem == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != elem) {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
