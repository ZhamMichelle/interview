package kz.zhami.interview.algorithms.another;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TwoPointers {
    public static void main(String[] args) {
        int[] arr = new int[]{-3, 0, 0, 3, 4};
        int k = 5;
        System.out.println(Arrays.toString(twoSumViaTwoPointers(arr, k)));
    }

    public static int[] twoSumViaTwoPointers(int[] arr, int k) {
        int left = 0;
        int right = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            int sum = arr[left] + arr[right];
            if (sum == k) {
                return new int[]{arr[left], arr[right]};
            } else if (sum < k) {
                left++;
            } else {
                right--;
            }
        }
        return new int[0];
    }

    public static int[] twoSumViaBinarySearch(int[] arr, int k) {
        for (int i = 0; i < arr.length; i++) {
            int findNumber = k - arr[i];
            int l = i + 1, r = arr.length - 1;
            while (l <= r) {
                int mid = l + (r - l) / 2;
                if (findNumber == arr[mid])
                    return new int[]{findNumber, arr[mid]};
                if (findNumber < arr[mid]) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
        }
        return new int[0];
    }

    public static int[] twoSumViaSet(int[] arr, int k) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            int findNumber = k - arr[i];
            if (set.contains(findNumber)) {
                return new int[]{findNumber, arr[i]};
            }
            set.add(arr[i]);
        }
        return new int[0];
    }
}
