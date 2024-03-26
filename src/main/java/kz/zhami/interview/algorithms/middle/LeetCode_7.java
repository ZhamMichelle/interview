package kz.zhami.interview.algorithms.middle;

import kz.zhami.interview.algorithms.sort.QuickSort;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class LeetCode_7 {
    public static void main(String[] args) {
        int x = -1254;
        System.out.println(reverse(x));
    }

    public static int reverse(int x) {
        if (x == 0) return 0;
        Queue<Integer> deque = new ArrayDeque<>();
        while (x != 0) {
            int digit = x % 10;
            x = x / 10;
            deque.add(digit);
        }
        long ans = 0;
        while (!deque.isEmpty()) {
            ans = ans * 10 + deque.poll();
        }
        if (ans >= Integer.MAX_VALUE || ans < Integer.MIN_VALUE)
            return 0;
        return (int) ans;
    }
}
