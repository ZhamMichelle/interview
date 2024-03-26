package kz.zhami.interview.algorithms.another;

public class CyclicSort_2 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 4, 3, 2};
        System.out.println(sort(arr));
    }

    public static int sort(int[] arr) {
        int i = 0;
        int j;
        while (i < arr.length) {
            if (arr[i] != (i + 1)) {
                j = arr[i] - 1;
                if (arr[i] != arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                } else {
                    return arr[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }
}
