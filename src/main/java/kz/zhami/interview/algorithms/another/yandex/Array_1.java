package kz.zhami.interview.algorithms.another.yandex;

import java.util.HashSet;
import java.util.Set;

public class Array_1 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 1, 8, 8, 5, 9, 4, 4};
        System.out.println(findUnqueNumber(arr));
    }

    public static int findUnqueNumber(int[] arr) {
        Set<Integer> set = new HashSet<>();
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!set.contains(arr[i])) {
                set.add(arr[i]);
            } else {
                set.remove(arr[i]);
            }
        }
        return set.iterator().next();
    }
}
