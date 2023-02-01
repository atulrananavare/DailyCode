package com.daily.Jan.jan29;

import java.util.Stack;

public class parenthesisChecker {
//    Given an expression string x. Examine whether the pairs and the orders of “{“,”}”,”(“,”)”,”[“,”]” are correct in exp.
//    For example, the function should return 'true' for exp = “[()]{}{[()()]()}” and 'false' for exp = “[(])”.

    public static void main(String[] args) {
        String s = "{[()]}}";
        boolean result = ispar(s);
        System.out.println(result);
    }

    //Function to check if brackets are balanced or not.
    static boolean ispar(String x) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < x.length(); i++) {
            char c = x.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if (!balanced(top, c)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static boolean balanced(Character ch1, Character ch2) {
        if ((ch1.equals('{')) && ch2.equals('}'))
            return true;
        else if ((ch1.equals('(')) && ch2.equals(')'))
            return true;
        else if ((ch1.equals('[')) && ch2.equals(']'))
            return true;
        else return false;
    }

}
