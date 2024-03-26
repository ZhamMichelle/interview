package kz.zhami.interview.algorithms.middle;

import java.util.ArrayDeque;
import java.util.Deque;

public class LeetCode_5 {
    public static void main(String[] args) {
        String s = "cbbd";
        System.out.println(longestPalindrome(s));
    }

    public static String longestPalindrome(String s) {
        String str = "";
        String helper = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = s.length() - 1; j >= 0; j--) {
                if (isPalindromic(s.substring(i, j + 1))) {
                    helper = s.substring(i, j + 1);
                    break;
                }
            }
            if (helper.length() > str.length())
                str = helper;
        }
        return str;
    }

    public static boolean isPalindromic(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i))
                return false;
        }
        return true;
    }
}
