package kz.zhami.interview.algorithms.another.middle;

import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromicSubstrings {
    public static void main(String[] args) {
        String str = "abaab";

    }

    public static int getNumberSubstrings(String str) {
        int count = 0;
        int index = 1;

        for (int i = 1; i < str.length(); i++) {
            for (int j = 0; j < index; j++) {
                if (str.charAt(j) == str.charAt(i)) {
                    count++;
                }

            }
        }
        return count;
    }
}
