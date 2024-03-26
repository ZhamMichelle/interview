package kz.zhami.interview.algorithms.sort;

import java.util.Arrays;

public class SelectionSortImproved {
    public static void main(String[] args) {
        int[] array = {10, 2, 10, 3, 1, 2, 5};
        for (int i = 0, k = array.length - 1; i < k; i++, k--) {
            int minIndex = i;
            int maxIndex = k;
            int min = array[i];
            int max = array[k];
            for (int j = i; j <= k; j++) {
                if (array[j] > max) {
                    max = array[j];
                    maxIndex = j;
                } else if (array[j] < min) {
                    min = array[j];
                    minIndex = j;
                }
            }
            swap(array, i, minIndex);

            if (array[minIndex] == max) {
                swap(array, k, minIndex);
            } else {
                swap(array, k, maxIndex);
            }

        }
        System.out.println(Arrays.toString(array));
    }

    public static void swap(int[] arr, int ind1, int ind2) {
        int tmp = arr[ind1];
        arr[ind1] = arr[ind2];
        arr[ind2] = tmp;
    }
}
