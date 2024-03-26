package kz.zhami.interview.algorithms.middle;

public class LeetCode_16 {
    public static void main(String[] args) {
        int[] nums = {-5, -5, -4, 0, 0, 3, 3, 4, 5};
        int target = -2;
        System.out.println(threeSumClosest(nums, target));
    }

    public static int threeSumClosest(int[] nums, int target) {
        int closestSum = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (Math.abs(target - sum) < Math.abs(target - closestSum)) {
                    closestSum = sum;
                }
                if (sum > target) k--;
                else j++;
            }
        }
        return closestSum;
    }
}
