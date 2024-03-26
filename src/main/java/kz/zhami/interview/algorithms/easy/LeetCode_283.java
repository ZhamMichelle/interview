package kz.zhami.interview.algorithms.easy;

import java.util.Arrays;

public class LeetCode_283 {
    public static void main(String[] args) {
        int[] nums = {0, 1};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes(int[] nums) {
        int ind = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                ind++;
            } else if (ind != 0) {
                nums[i - ind] = nums[i];
            }
        }
        if (ind != 0) {
            for (int i = nums.length - ind; i < nums.length; i++) {
                nums[i] = 0;
            }
        }
    }
}
