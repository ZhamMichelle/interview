package kz.zhami.interview.algorithms.another;

public class BinarySearch {
    public static void main(String[] args) {
//        int[] arr = {1, 3, 7, 15, 48, 95};
        int[] arr = {95, 48, 15, 7, 3, 1};
        System.out.println(useBinarySearch(arr, 48, 0, arr.length));
    }

    public static int useBinarySearch(int[] arr, int value, int left, int right) {
        int middle = (left + (right - left) / 2);
        if (arr[middle] == value) {
            return middle;
        } else if (arr[middle] < value) {
            return useBinarySearch(arr, value, middle + 1, right);
        } else {
            return useBinarySearch(arr, value, left, middle - 1);
        }
    }
}
