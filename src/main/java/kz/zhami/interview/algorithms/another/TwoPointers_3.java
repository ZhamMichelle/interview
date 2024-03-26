package kz.zhami.interview.algorithms.another;

import java.util.Arrays;

public class TwoPointers_3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 6};
        System.out.println(Arrays.toString(getPairSum(arr, 6)));
    }

    public static int[] getPairSum(int[] arr, int sum) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int value = arr[start] - arr[end];
            if (value == sum)
                return new int[]{arr[start], arr[end]};

            if (value < 0) {
                end--;
            } else {
                start++;
            }
        }
        return new int[0];
    }
}
