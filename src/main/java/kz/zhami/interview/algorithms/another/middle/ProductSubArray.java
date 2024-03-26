package kz.zhami.interview.algorithms.another.middle;

public class ProductSubArray {
    public static void main(String[] args) {
        int[] arr = {-2,3,2,-4};
        System.out.println(getProduct_1(arr, arr.length));
    }

    public static int getProduct_1(int[] arr, int n) {
        int max_end = arr[0];
        int min_ending_here = arr[0];

        for (int i = 1; i < arr.length; i++) {
            max_end = Math.max(
                    Math.max(arr[i], max_end * arr[i]),
                    min_ending_here * arr[i]);
            min_ending_here = Math.min(
                    Math.min(arr[i], arr[i] * max_end),
                    arr[i] * min_ending_here);

        }

        return max_end;
    }


    public static int getProduct(int[] arr, int n) {
        int max_ending_here = arr[0];

        int min_ending_here = arr[0];

        int max_so_far = arr[0];

        for (int i = 1; i < n; i++) {
            int temp =
                    Math.max(arr[i], arr[i] * max_ending_here);
            max_ending_here = temp;
            max_so_far
                    = Math.max(max_so_far, max_ending_here);
        }
        return max_so_far;
    }
}
