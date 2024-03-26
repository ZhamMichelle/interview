package kz.zhami.interview.algorithms.easy;

/**
 * @author zhamilya on 3/20/24
 */
public class LeetCode_342 {
    public static void main(String[] args) {
        System.out.println(isPowerOfFour(8));
    }

    public static boolean isPowerOfFour(int n) {
        if ((Math.log(n) / Math.log(4)) % 1 == 0 && n != 0) {
            return true;
        }
        return false;
    }
}
