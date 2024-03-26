package kz.zhami.interview.algorithms.another;

public class SQRT {
    public static void main(String[] args) {
        System.out.println(getSQRT_1(15));
    }

    public static int getSQRT_1(int x) {
        float min = 0;
        float max = x;
        float middle;

        while (true) {
            middle = (min + max) / 2;
            float res = middle * middle;
            if (x >= res && (x - res) < 0.001) {
                return (int) middle;
            } else if (res > x) {
                max = middle;
            } else {
                min = middle;
            }
        }
    }


    public static int getSQRT(int x) {
        double min = 0;
        double max = x;
        if (x == 1)
            return 1;
        double mid = 0.0;
        while (true) {
            mid = (double) ((min + max) / 2);
            double res = mid * mid;
            if (x == res || (x > res && (x - res) < 0.001)) {
                break;
            } else if (res > x) {
                max = mid;
            } else {
                min = mid;
            }
        }
        return (int) mid;
    }
}
