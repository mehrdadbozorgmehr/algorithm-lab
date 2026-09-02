package org.example.leetcode.validparentheses;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ValidParentheses {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                if (c == ')' && !stack.pop().equals('(')) {
                    return false;
                } else if (c == ']' && !stack.pop().equals('[')) {
                    return false;
                } else if (c == '}' && !stack.pop().equals('{')) {
                    return false;
                }
            }

        }
        return stack.isEmpty();
    }

    public boolean isValid2(String s) {
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                list.add(c);
            } else {
                char top = list.get(list.size() - 1);
                if ((c == ')' && top == '(')
                        || (c == ']' && top == '[')
                        || (c == '}' && top == '{')) {
                    list.remove(list.size() - 1);
                } else {
                    return false;
                }

            }

        }
        return list.isEmpty();
    }

    static void main() {

        ValidParentheses p = new ValidParentheses();
        System.out.println(p.isValid("()"));

    }
}
