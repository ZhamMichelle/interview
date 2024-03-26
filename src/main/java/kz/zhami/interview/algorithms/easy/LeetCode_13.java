package kz.zhami.interview.algorithms.easy;

public class LeetCode_13 {
    public static void main(String[] args) {
        String s = "XIV";
        System.out.println(romanToInt(s));
    }
    public static int romanToInt(String s) {
        int num = 0;
        int ans = 0;
        for(int i = s.length() - 1; i >= 0; i--) {
            switch(s.charAt(i)) {
                case 'I' : num = 1;
                    break;
                case 'V' : num = 5;
                    break;
                case 'X' : num = 10;
                    break;
                case 'L' : num = 50;
                    break;
                case 'C' : num = 100;
                    break;
                case 'D' : num = 500;
                    break;
                case 'M' : num = 1000;
            }
            if(4 * num < ans) {
                ans -= num;
            } else {
                ans += num;
            }
        }
        return ans;
    }

    public static int romanToInt1(String s) {
        char[] cs = s.toCharArray();
        int res = 0;

        for (int i = 0; i < s.length(); i++) {
            var getDouble = i<s.length()-1 ? getDoubleTranslation(String.valueOf(cs[i]) + cs[i + 1]) : 0;
            if (getDouble != 0) {
                res = res + getDouble;
                i++;
            } else {
                res = res + getTranslation(cs[i]);
            }

        }
        return res;
    }

    public static int getDoubleTranslation(String str) {
        return switch (str) {
            case "IV" -> 4;
            case "IX" -> 9;
            case "XL" -> 40;
            case "XC" -> 90;
            case "CD" -> 400;
            case "CM" -> 900;
            default -> 0;
        };
    }

    public static int getTranslation(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
    }
}
