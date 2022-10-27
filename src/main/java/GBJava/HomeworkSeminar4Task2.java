package GBJava;

import java.util.Stack;

public class HomeworkSeminar4Task2 {
    public static void main(String[] args) {
        String[] token = new String[]{"2", "1", "+", "-3", "*"};
        System.out.println(evalRPN(token));
    }

    public static int evalRPN(String[] tokens) {
        int result = 0;
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if (isDigit(tokens[i])) {
                stack.push(Integer.parseInt(tokens[i]));
            } else {
                if ("+".equals(tokens[i])) {
                    result = stack.pop() + stack.pop();
                    stack.push(result);
                }
                if ("-".equals(tokens[i])) {
                    result = -stack.pop() + stack.pop();
                    stack.push(result);
                }
                if ("*".equals(tokens[i])) {
                    result = stack.pop() * stack.pop();
                    stack.push(result);
                }
                if ("/".equals(tokens[i])) {
                    result = stack.pop();
                    result = stack.pop() / result;
                    stack.push(result);
                }
            }
        }
        return stack.pop();
    }
    public static boolean isDigit(String s){
        try {
            int Value = Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
