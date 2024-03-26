package kz.zhami.interview.algorithms.another.middle;

public class MinimumRotatedArray {
    public static void main(String[] args) {
        int[] arr = {7, 9, 11, 12, 5};
        System.out.println(getSmallestNumber(arr));
    }

    public static int getSmallestNumber(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            if (arr[i - 1] > arr[i]) {
                return arr[i];
            }
        }
        return arr[0];
    }
}
