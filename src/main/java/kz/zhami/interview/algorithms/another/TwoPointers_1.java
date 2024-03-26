package kz.zhami.interview.algorithms.another;

import java.util.Arrays;

public class TwoPointers_1 {
    public static void main(String[] args) {
        int[] arr = new int[]{-3, -1, 0, 1, 2};
        System.out.println(Arrays.toString(makeSquares(arr)));
    }

    public static int[] makeSquares(int[] arr) {
        int[] newArr = new int[arr.length];
        int left = 0;
        int right = arr.length - 1;
        int highestSquareIdx = arr.length - 1;
        while (left <= right) {
            int leftValue = arr[left] * arr[left];
            int rightValue = arr[right] * arr[right];
            if (leftValue > rightValue) {
                newArr[highestSquareIdx--] = leftValue;
                left++;
            } else {
                newArr[highestSquareIdx--] = rightValue;
                right--;
            }
        }
        return newArr;
    }
}
