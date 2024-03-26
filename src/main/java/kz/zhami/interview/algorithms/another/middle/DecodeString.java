package kz.zhami.interview.algorithms.another.middle;

import java.util.*;

public class DecodeString {
    public static void main(String[] args) {
        String str = "3[a3[c]]";
        System.out.println(decode_2(str));
    }

    public static String decode_2(String str) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<String> stack2 = new Stack<>();
        int num = 0;
        StringBuilder res = new StringBuilder();
        for (char c : str.toCharArray()) {
            if ('0' <= c && c <= '9') {
                num = num * 10 + c - '0';
            } else if (c == '[') {
                stack1.push(num);
                num = 0;
                stack2.push(res.toString());
                res.setLength(0);
            } else if (c == ']') {
                StringBuilder builder = new StringBuilder();
                for (int i = 0, n = stack1.pop(); i < n; i++) {
                    builder.append(res);
                }
                res.append(stack2.pop());
                res.append(builder);
            } else {
                res.append(c);
            }
        }
        return res.toString();
    }


    public static String decode_1(String str) {
        Stack<String> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        String res = "";
        int num = 0;
        for (char c : str.toCharArray()) {
            if ('0' < c && c <= '9') {
                num = num * 10 + c - '0';
            } else if (c == '[') {
                stack2.push(num);
                num = 0;
                stack1.push(res);
                res = "";
            } else if (c == ']') {
                StringBuilder builder = new StringBuilder();
                for (int i = 0, n = stack2.pop(); i < n; i++) {
                    builder.append(res);
                }
                res = stack1.pop() + builder.toString();
            } else {
                res += String.valueOf(c);
            }
        }
        return res;
    }


    public static String decode(String s) {
        Deque<Integer> s1 = new ArrayDeque<>();
        Deque<String> s2 = new ArrayDeque<>();
        int num = 0;
        String res = "";
        for (char c : s.toCharArray()) {
            if ('0' <= c && c <= '9') {
                num = num * 10 + c - '0';
            } else if (c == '[') {
                s1.push(num);
                s2.push(res);
                num = 0;
                res = "";
            } else if (c == ']') {
                StringBuilder t = new StringBuilder();
                for (int i = 0, n = s1.pop(); i < n; ++i) {
                    t.append(res);
                }
                res = s2.pop() + t.toString();
            } else {
                res += String.valueOf(c);
            }
        }
        return res;
    }
}
