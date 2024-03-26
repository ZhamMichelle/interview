package kz.zhami.interview.algorithms.another;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CyclicSort_1 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 1, 8, 2, 3, 5, 1}; //{1,1,2,2,3,3,5,8}
        sort(arr);
    }

    public static void sort(int[] arr) {
        int i = 0;
        int j;
        while (i < arr.length) {
            j = arr[i] - 1;
            if (arr[i] != arr[j]) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            } else {
                i++;
            }
        }

        System.out.println(Arrays.toString(arr));

        for (int k = 0; k < arr.length; k++) {
            if(arr[k]!=k+1)
                System.out.println(k+1);
        }
    }
}
