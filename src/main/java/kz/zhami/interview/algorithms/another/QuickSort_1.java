package kz.zhami.interview.algorithms.another;

import java.util.Arrays;

public class QuickSort_1 {
    public static void main(String[] args) {
        int[] arr = {5, 7, 1, 6, 4, 9, 2};
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr, int leftBorder, int rightBorder) {
        int left = leftBorder;
        int right = rightBorder;
        int pivot = arr[(left + right) / 2];

        do {
            while (arr[left] < pivot) {
                left++;
            }
            while (arr[right] > pivot) {
                right--;
            }

            if (arr[right] <= arr[left]) {
                if (arr[right] < arr[left]) {
                    int temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                }
                left++;
                right--;
            }
        } while (left <= right);

        if (left < rightBorder) {
            sort(arr, left, rightBorder);
        }
        if (right > leftBorder) {
            sort(arr, leftBorder, right);
        }
    }
}
