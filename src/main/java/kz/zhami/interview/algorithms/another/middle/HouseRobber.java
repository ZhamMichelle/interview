package kz.zhami.interview.algorithms.another.middle;

public class HouseRobber {
    public static void main(String[] args) {
        int hval[] = {5, 3, 4, 11, 2};
        int n = hval.length;
        System.out.println("Maximum loot possible : "
                + maxLoot(hval, n - 1));
    }

    static int maxLoot(int hval[], int n) {
        if (n < 0) {
            return 0;
        }

        if (n == 0) {
            return hval[0];
        }

        int pick = hval[n] + maxLoot(hval, n - 2);
        int notPick = maxLoot(hval, n - 1);
        return Math.max(pick, notPick);
    }
}