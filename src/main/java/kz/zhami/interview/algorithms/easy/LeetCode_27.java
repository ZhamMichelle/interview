package kz.zhami.interview.algorithms.easy;

import java.util.Arrays;

public class LeetCode_27 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 2, 3, 0, 4, 2};
        int val = 2;
        System.out.println(removeElement(nums, val));
//        int[] arr1 = {1,3,5,7,8,9};
//        int[] arr2 = {2,4,6,9,14,17,25,36};
//        int res = 11;
//        System.out.println(getPara(arr1, arr2, res));
    }

    public static int removeElement(int[] nums, int val) {
        var count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                    nums[count++] = nums[i];
            }
        }
        System.out.println(Arrays.toString(nums));
        return count;
    }

//    public static boolean getPara(int[] arr1, int[] arr2, int res) {
//        for(int i=arr1.length-1;i>=0;i--){}
//    }
}
