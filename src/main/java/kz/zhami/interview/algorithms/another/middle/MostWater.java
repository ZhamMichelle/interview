package kz.zhami.interview.algorithms.another.middle;

public class MostWater {
    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 4, 5};
        System.out.println(getMostAmount(arr));
    }

    public static int getMostAmount(int[] arr) {
        int amount = 0;
        int left = 0;
        int right = arr.length-1;
        while (left <= right) {
            amount = Math.max(amount, Math.min(arr[left], arr[right]) * (right - left));
            if (arr[left] < arr[right]) {
                left++;
            } else {
                right--;
            }
        }
        return amount;
    }
}
