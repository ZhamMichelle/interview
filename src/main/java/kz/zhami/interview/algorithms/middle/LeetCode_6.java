package kz.zhami.interview.algorithms.middle;

public class LeetCode_6 {
    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        System.out.println(convert(s, numRows).equals("PAHNAPLSIIGYIR"));
    }

    public static String convert(String s, int numRows) {
        int n = s.length();
        StringBuilder[] arr = new StringBuilder[s.length()];
        for (int i = 0; i < n; i++) arr[i] = new StringBuilder();

        int i = 0;
        while (i < n) {
            for (int j = 0; j < numRows && i < n; j++) {
                arr[j].append(s.charAt(i++));
            }

            for (int j = numRows - 2; j > 0 && i<n; j--) {
                arr[j].append(s.charAt(i++));
            }
        }

        StringBuilder ans = new StringBuilder();
        for (StringBuilder b : arr) {
            ans.append(b);
        }
        return ans.toString();
    }
}
