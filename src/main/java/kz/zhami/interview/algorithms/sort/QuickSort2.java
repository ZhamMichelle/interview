package kz.zhami.interview.algorithms.sort;

import java.util.Arrays;

public class QuickSort2 {
    public static void main(String[] args) {
        int[] arr = {10, 5, 2, 17, 8, 3, 5};
        qsort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void qsort(int[] arr, int leftBorder, int rightBorder) {
        int pivot = arr[(leftBorder + rightBorder) / 2];
        int leftMarker = leftBorder;
        int rightMarker = rightBorder;

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

        System.out.println("leftMarker: " + leftMarker);
        System.out.println("rightMarker: " + rightMarker);

        if (leftMarker < rightBorder)
            qsort(arr, leftMarker, rightBorder);

        if (rightMarker > leftBorder)
            qsort(arr, leftBorder, rightMarker);

    }


    public static void swap(int[] arr, int ind1, int ind2) {
        int tmp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = tmp;
    }
}
