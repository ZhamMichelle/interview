package kz.zhami.interview.algorithms.another;

public class Pangram {
    public static void main(String[] args) {
        String str = "Abcdefghijklmnopqstuvwxyz";
        System.out.println(isPangram_1(str));
    }

    public static boolean isPangram_1(String str) {
        str = str.toLowerCase();
        boolean[] marker = new boolean[26];
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                int index = str.charAt(i) - 'a';
                marker[index] = true;
            }
        }
        for (int i = 0; i < marker.length; i++) {
            if (!marker[i])
                return false;
        }
        return true;
    }

    public static boolean isPangram(String str) {
        str = str.toLowerCase();
        for (char c = 'a'; c <= 'z'; c++) {
            if (!str.contains(String.valueOf(c)))
                return false;
        }
        return true;
    }
}
