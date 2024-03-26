package kz.zhami.interview.algorithms.another;

import java.util.Arrays;

public class TwoPointers_4 {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 3, 3, 6, 9, 9};
        removeElement(arr,6);
        System.out.println(Arrays.toString(arr));
    }

    public static void removeElement(int[] arr, int key) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != key) {
                arr[counter++]=arr[i];
            }
        }
        var newArr = Arrays.copyOf(arr,counter);
        System.out.println(Arrays.toString(newArr));
    }

    public static int remove_1(int[] arr) {
        int nonDuplicate = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[nonDuplicate - 1] != arr[i]) {
                arr[nonDuplicate] = arr[i];
                nonDuplicate++;
            }
        }
        return nonDuplicate;
    }

    public static int remove(int[] arr) {
        int nonDuplicate = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[nonDuplicate - 1] != arr[i]) {
                arr[nonDuplicate] = arr[i];
                nonDuplicate++;
            }
        }
        return nonDuplicate;
    }
}
