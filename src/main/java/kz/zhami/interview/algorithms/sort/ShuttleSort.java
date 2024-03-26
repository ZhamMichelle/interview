package kz.zhami.interview.algorithms.sort;

import java.util.Arrays;

public class ShuttleSort {
    public static void main(String[] args) {
        int[] array = {10, 2, 10, 3, 1, 2, 5};
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[i - 1]) {
                swap(array, i - 1, i);
                for (int z = i - 1; z - 1 >= 0; z--) {
                    if (array[z] < array[z - 1])
                        swap(array, z - 1, z);
                }
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
