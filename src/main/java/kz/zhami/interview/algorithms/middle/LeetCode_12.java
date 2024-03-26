package kz.zhami.interview.algorithms.middle;

import java.util.ArrayDeque;

public class LeetCode_12 {
    public static void main(String[] args) {
        int roman = 1994;
        System.out.println(intToRoman(roman));
    }

    public static String intToRoman(int num) {
        int[] value = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String[] symbol = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M"};
        StringBuilder str = new StringBuilder();
        int limit = value.length - 1;
        while (num > 0) {
            for (int i = limit; i >= 0; i--) {
                if (value[i] <= num) {
                    str.append(symbol[i]);
                    num = num - value[i];
//                    limit = i;
                    break;
                }
            }
        }
        return str.toString();
    }

    public static String intToRoman1(int num) {
        ArrayDeque<String> queue = new ArrayDeque<>();
        StringBuilder ans = new StringBuilder();
        int redix = 0;
        while (num != 0) {
            int helper = num % 10;
            num = num / 10;
            if (helper == 4 || helper == 9 || helper == 5) {
                queue.addFirst(getRoman(helper, redix));
            } else {
                for (int i = 0; i < (helper > 5 ? helper - 5 : helper); i++) {
                    queue.addFirst(getRoman(1, redix));
                }
                if (helper > 5) {
                    queue.addFirst(getRoman(5, redix));
                }

            }
            redix++;
        }
        while (!queue.isEmpty()) {
            ans.append(queue.poll());

        }
        return ans.toString();
    }

    public static String getRoman(int num, int redix) {
        switch (redix) {
            case 0:
                switch (num) {
                    case 1:
                        return "I";
                    case 4:
                        return "IV";
                    case 5:
                        return "V";
                    case 9:
                        return "IX";
                }
                ;
            case 1:
                switch (num) {
                    case 1:
                        return "X";
                    case 4:
                        return "XL";
                    case 5:
                        return "L";
                    case 9:
                        return "XC";
                }
            case 2:
                switch (num) {
                    case 1:
                        return "C";
                    case 4:
                        return "CD";
                    case 5:
                        return "D";
                    case 9:
                        return "CM";
                }
            case 3:
                return "M";
            default:
                return "";
        }
    }
}
