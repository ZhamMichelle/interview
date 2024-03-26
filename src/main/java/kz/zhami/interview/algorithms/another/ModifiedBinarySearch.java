package kz.zhami.interview.algorithms.another;

public class ModifiedBinarySearch {
    public static void main(String[] args) {
        int[] arr = {10, 6, 4, 3, 2, 1};
        System.out.println(binarySearch(arr, 10));
    }

    public static int binarySearch(int[] arr, int value) {
        int left = 0;
        int right = arr.length - 1;
        var isAscending = arr[left] < arr[right];

        while (left <= right) {
            int middle = (left + right) / 2;
            if (arr[middle] == value)
                return middle;

            if (isAscending) {
                if (arr[middle] < value) {
                    left = middle + 1;
                } else {
                    right = middle - 1;
                }
            } else {
                if (arr[middle] < value) {
                    right = middle - 1;
                } else {
                    left = middle + 1;
                }
            }
        }
        return -1;
    }
}
