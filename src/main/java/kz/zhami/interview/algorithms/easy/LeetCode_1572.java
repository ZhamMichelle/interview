package kz.zhami.interview.algorithms.easy;

public class LeetCode_1572 {
    public static void main(String[] args) {
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(diagonalSum(mat));
    }

    public static int diagonalSum(int[][] mat) {
        int res = 0;
        for (int i = 0; i < mat.length; i++) {
            res += mat[i][i];
            if (mat.length - 1 - i != i)
                res += mat[mat.length - 1 - i][i];
        }
        return res;
    }
}
