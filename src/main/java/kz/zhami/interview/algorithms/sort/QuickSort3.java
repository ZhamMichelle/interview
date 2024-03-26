package kz.zhami.interview.algorithms.sort;

import java.util.Arrays;

public class QuickSort3 {
    public static void main(String[] args) {
        int[] array = {10, 5, 2, 17, 8, 3, 5};
        getQuickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    public static void getQuickSort(int[] arr, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        int pivot = arr[(leftMarker + rightMarker) / 2];

        do {
            while (arr[leftMarker] < pivot) {
                leftMarker++;
            }

            while (arr[rightMarker] > pivot) {
                rightMarker--;
            }

            if (leftMarker <= rightMarker) {
                if (leftMarker < rightMarker) {
                    swap(arr, leftMarker, rightMarker);
                }
                leftMarker++;
                rightMarker--;
            }

        } while (leftMarker <= rightMarker);

        if (leftMarker < rightBorder) {
            getQuickSort(arr, leftMarker, rightBorder);
        }
        if (rightMarker > leftBorder) {
            getQuickSort(arr, leftBorder, rightMarker);
        }
    }

    public static void swap(int[] arr, int left, int right) {
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
