package kz.zhami.interview.algorithms.sort;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {10, 5, 2, 17, 8, 3, 5};
        getQuickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }

    public static void getQuickSort(int[] array, int leftBorder, int rightBorder) {
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;
        int pivot = array[(leftBorder + rightBorder) / 2];

        do {
            while (array[leftMarker] < pivot) {
                leftMarker++;
            }

            while (array[rightMarker] > pivot) {
                rightMarker--;
            }

            if (leftMarker <= rightMarker) {
                if (leftMarker < rightMarker) {
                    swap(array, leftMarker, rightMarker);
                }
                leftMarker++;
                rightMarker--;
            }

        } while (leftMarker <= rightMarker);

        if (leftMarker < rightBorder) {
            getQuickSort(array, leftMarker, rightBorder);
        }
        if (leftBorder < rightMarker) {
            getQuickSort(array, leftBorder, rightMarker);
        }
    }

    public static void swap(int[] arr, int ind1, int ind2) {
        int tmp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = tmp;
    }
}
