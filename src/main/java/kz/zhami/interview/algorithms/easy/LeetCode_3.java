package kz.zhami.interview.algorithms.easy;

import java.util.HashSet;
import java.util.Set;

public class LeetCode_3 {
    public static void main(String[] args) {
        String s = "qrsvbspk";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int counter = 0;
        int helper = 0;
        for (int i = 0; i < s.length(); i++) {
            while (set.contains(s.charAt(i))) {
                set.remove(s.charAt(helper));
                helper++;
            }
            set.add(s.charAt(i));
            counter = Math.max(counter, i - helper + 1);
        }
        return counter;
    }
}
