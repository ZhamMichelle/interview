package kz.zhami.interview.algorithms.easy;

public class LeetCode_9 {
    public static void main(String[] args) {
        int x = 1211;
        System.out.println(isPalindrome(x));
    }

//    public static boolean isPalindrome(int x) {
//        char[] c = String.valueOf(x).toCharArray();
//        for (int i = 0; i < (c.length) / 2; i++) {
//            if(c[i]!=c[c.length-i-1])
//                return false;
//        }
//        return true;
//    }

    public static boolean isPalindrome(int x) {
        if (x < 0) return false;
        int rev = reverse(x);
        char[] c = String.valueOf(x).toCharArray();
        for (int i = 0; i < (c.length) / 2; i++) {
            if (c[i] != c[c.length - i - 1])
                return false;
        }
        return true;
    }

    public static int reverse(int x) {
        int res = 0;
        while (x != 0) {
            int mod = x % 10;
            res = res*10 + mod;
            x=x/10;
        }
        return res;
    }
}
