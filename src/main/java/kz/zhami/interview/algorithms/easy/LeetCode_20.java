package kz.zhami.interview.algorithms.easy;

import java.util.Stack;

public class LeetCode_20 {
    public static void main(String[] args) {
        String s = "]"; //{[]}     {[]}   [{]}
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        char[] ch = s.toCharArray();

        for (char c : ch) {
            if (!stack.isEmpty() &&
                    ((c == ')' && stack.pop() == '(') || (c == ']' && stack.pop() == '[') || (c == '}' && stack.pop() == '{'))
            ) {

            } else {
                stack.push(c);
            }
        }
        System.out.println(stack);
        return stack.isEmpty();
    }


}
