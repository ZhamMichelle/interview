package kz.zhami.interview.algorithms.easy;

public class LeetCode_70 {
    public static void main(String[] args) {
        int n = 6;
        System.out.println(climbStairs(n));
    }

    public static int climbStairs(int n) {
        int ways = 1;

        for (int i = 1; i <= n / 2; i++) {
            double sum = 1;

            for (int j = i; j < 2 * i; j++) {
                sum *= (double)(n - j) / (j - i + 1);
            }

            ways += sum;
        }

        return ways;
    }

    public static int factorialUsingForLoop(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }
}

// 1         //-1

// 1 1       //-2
// 2

// 1 1 1     //-3
// 1 2
// 2 1

// 1 1 1 1  //-4
// 1 1 2
// 1 2 1
// 2 1 1
// 2 2

// 1 1 1 1 1  //-5
// 1 1 1 2
// 1 1 2 1
// 1 2 1 1
// 2 1 1 1
// 1 2 2
// 2 1 2
// 2 2 1

// 1 1 1 1 1 1  //-6
// 1 1 1 1 2
// 1 1 1 2 1
// 1 1 2 1 1
// 1 2 1 1 1
// 2 1 1 1 1
// 1 1 2 2
// 1 2 1 2
// 1 2 2 1
// 2 2 1 1
// 2 1 1 2
// 2 1 2 1
// 2 2 2