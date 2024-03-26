package kz.zhami.interview.algorithms.another;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {-1, -2, -3, -4, -5};
        int target = -8;
        System.out.println(Arrays.toString(getTwoSum(arr, target)));
    }

    public static int[] getTwoSum(int[] arr, int target) {
        int[] res = new int[2];
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(target - arr[i])) {
                res[0] = map.get(target - arr[i]);
                res[1] = i;
                break;
            } else {
                map.put(arr[i], i);
            }
        }
        return res;
    }
}
