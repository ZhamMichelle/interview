package kz.zhami.interview.algorithms.another;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 1, 4,0};
        sort_2(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort_2(int[] arr) {
        int i = 0;
        int j;
        while (i < arr.length) {
            j = arr[i];
            if (arr[i] != arr[j]) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            i++;
            System.out.println("RES: " + Arrays.toString(arr));
        }
    }


    public static void sort_1(int[] arr) {
        int i = 0;
        int j;
        while (i < arr.length) {
            j = arr[i] - 1;
            if (arr[i] < arr.length && arr[i] != arr[j]) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            } else {
                i++;
            }
        }

        for (int k = 0; k < arr.length; k++) {
            if (k != arr[k])
                System.out.println(k);
        }
    }


    public static void sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int j = arr[i] - 1;
            if (arr[i] != arr[j]) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            } else {
                i++;
            }
        }
    }
}
