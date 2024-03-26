package kz.zhami.interview.algorithms.another;

import java.util.Arrays;

public class TwoPointers_5 {
    public static void main(String[] args) {
        int[] arr = {-2, -1, 0, 2, 3};
        System.out.println(Arrays.toString(getSquareArray(arr)));
    }

    public static int[] getSquareArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        int first, second;
        int squareIndex = right;
        int[] newArr = new int[arr.length];

        while (left < right) {
            first = arr[left] * arr[left];
            second = arr[right] * arr[right];
            if (second > first) {
                newArr[squareIndex--] = second;
                right--;
            } else {
                newArr[squareIndex--] = first;
                left++;
            }

        }
        return newArr;
    }
}
