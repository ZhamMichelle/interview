package kz.zhami.interview.algorithms.another;

import java.util.HashMap;
import java.util.Map;

public class GoodPairs {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(getNumberGoodPairs(nums));
    }

    public static int getNumberGoodPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int counter = 0;
        for (int num : nums) {
            if (map.get(num) != null) {
                counter += map.get(num);
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }
        return counter;
    }
}
