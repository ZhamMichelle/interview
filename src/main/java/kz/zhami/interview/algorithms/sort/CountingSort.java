package kz.zhami.interview.algorithms.sort;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] array = {10, 2, 10, 3, 1, 2, 5};
        System.out.println(Arrays.toString(countingSort(array, 11)));
    }

    public static int[] countingSort(int[] theArray, int maxValue) {
        int[] nums = new int[maxValue + 1];
        for (int num : theArray) {
            nums[num]++;
        }
        int[] sortedArray = new int[theArray.length];
        int helper = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i]; j++) {
                sortedArray[helper] = i;
                helper++;
            }
        }
        return sortedArray;
    }
}
