package kz.zhami.interview.algorithms.another;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Set;

public class SlidingWindow_1 {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 1, 3, 2};
        System.out.println(getMaxSubKArray(arr, 3));
    }

    public static int getMaxSubKArray(int[] arr, int k) {

        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        int helper = sum;
        for (int i = k; i < arr.length; i++) {
            helper = helper + arr[i] - arr[i - k];
            if (sum < helper) {
                sum = helper;
            }
        }
        return sum;
    }
}
