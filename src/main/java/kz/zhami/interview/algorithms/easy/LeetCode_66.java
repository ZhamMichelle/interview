package kz.zhami.interview.algorithms.easy;

import java.util.Arrays;

public class LeetCode_66 {
    public static void main(String[] args) {
        int[] digits = {1,2,3};
        System.out.println(Arrays.toString(plusOne(digits)));
    }

    public static int[] plusOne(int[] digits) {
//        int[] res = Arrays.copyOf(digits, digits.length);

        digits[digits.length - 1] = (digits[digits.length - 1] + 1) % 10;
        for (int i = digits.length - 1; i > 0; i--) {
            if (digits[i - 1] == 9 && digits[i] == 0) {
                digits[i - 1] = 0;
            } else if (digits[i] == 0) {
                digits[i - 1] = digits[i - 1] + 1;
            } else {
                break;
            }
        }
        if (digits[0] == 0) {
            int[] ans = new int[digits.length + 1];
            ans[0] = 1;
            System.arraycopy(digits, 0, ans, 1, digits.length);
            return ans;
        }
        return digits;
    }
}
