package kz.zhami.interview.algorithms.another;

public class PerfectSquare {
    public static void main(String[] args) {
        System.out.println(isValidPerfectSquare_1(9));
    }

    public static boolean isValidPerfectSquare_1(int num) {
        int left = 1;
        int right = num;
        while (left < right) {
            int middle = (left + right) / 2;
            if (middle >= num / middle) {
                right = middle;
            } else {
                left = middle + 1;
            }
        }
        return left * right == num;
    }


    public static boolean isValidPerfectSquare(int num) {
        long l = 1;
        long r = num;

        while (l < r) {
            final long m = (l + r) / 2;
            if (m >= num / m)
                r = m;
            else
                l = m + 1;
        }

        return l * l == num;
    }
}
