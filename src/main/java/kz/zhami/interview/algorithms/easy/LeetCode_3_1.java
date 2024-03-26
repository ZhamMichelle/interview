package kz.zhami.interview.algorithms.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LeetCode_3_1 {
    public static void main(String[] args) {
        String s = "araaci";
        int k = 2;
        System.out.println(kDistinct(s, k));
    }

    public static int kDistinct(String s, int k) {
        int n = s.length();
        int answer = -1;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                Set<Character> distinct = new HashSet<>();
                for (int x = i; x < j; x++) {
                    distinct.add(s.charAt(x));
                }
                if (distinct.size() == k) {
                    answer = Math.max(answer, j - i);
                }
            }
        }
        return answer;
    }
}
