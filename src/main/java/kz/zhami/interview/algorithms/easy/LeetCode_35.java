package kz.zhami.interview.algorithms.easy;

public class LeetCode_35 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 7;
        System.out.println(searchInsert(nums,target));
    }

    public static int searchInsert(int[] nums, int target) {
        if(nums[nums.length-1]<target)
            return nums.length;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target)
                return i;

            if (nums[i] > target)
                return i;
        }

        return 0;
    }
}

//    int start = 0;
//    int end = nums.length - 1;
//        while (start <= end) {
//                int mid = (start + end) / 2;
//                if (nums[mid] > target) {
//                end = mid - 1;
//                } else if (nums[mid] < target) {
//        start = mid + 1;
//        } else {
//        return mid;
//        }
//        }
//        return start;