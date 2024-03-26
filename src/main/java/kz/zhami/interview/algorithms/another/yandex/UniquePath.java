package kz.zhami.interview.algorithms.another.yandex;

public class UniquePath {
    public static void main(String[] args) {
        System.out.println(paths(3, 2));
    }

    public static int paths(int n, int m) {
        if (n < 1 || m < 1) {
            return 0;
        }
        if (n == 1 && m == 1) {
            return 1;
        }
        return paths(n - 1, m) + paths(n, m - 1);
    }
}
