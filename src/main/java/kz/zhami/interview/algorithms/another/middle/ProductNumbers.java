package kz.zhami.interview.algorithms.another.middle;

import java.util.Arrays;

/*Product of Array Except Self */
public class ProductNumbers {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));
        int n = arr.length;
        System.out.println(Arrays.toString(multiply_1(arr)));
    }

    public static int[] multiply_1(int[] arr) {
        int n = arr.length;
        if (n == 1)
            return arr;

        int[] left = new int[n];
        int[] right = new int[n];
        int[] prod = new int[n];

        left[0] = 1;
        right[n - 1] = 1;

        for (int i = 1; i < n; i++)
            left[i] = arr[i-1] * left[i-1];

        for (int i = n - 2; i >= 0; i--)
            right[i] = arr[i+1] * right[i+1];

        for (int i = 0; i < n; i++)
            prod[i] = left[i] * right[i];

        return prod;
    }


    public static int[] multiply(int[] arr, int n) {
        if (n == 1) {
            return arr;
        }
        int[] left = new int[n];
        int[] right = new int[n];
        int[] prod = new int[n];

        int i, j;
        left[0] = 1;

        right[n - 1] = 1;

        for (i = 1; i < n; i++)
            left[i] = arr[i - 1] * left[i - 1];
        System.out.println("left: " + Arrays.toString(left));

        for (j = n - 2; j >= 0; j--)
            right[j] = arr[j + 1] * right[j + 1];
        System.out.println("right: " + Arrays.toString(right));

        for (i = 0; i < n; i++)
            prod[i] = left[i] * right[i];

        return prod;
    }
}
