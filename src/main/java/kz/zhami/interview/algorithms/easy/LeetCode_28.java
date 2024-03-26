package kz.zhami.interview.algorithms.easy;

public class LeetCode_28 {
    public static void main(String[] args) {
        String haystack = "mississippi", needle = "issipi";
        System.out.println(strStr(haystack, needle));
    }

    public static int strStr(String haystack, String needle) {
        if (haystack.length() < needle.length())
            return -1;
        for (int i = 0; i < haystack.length()-needle.length()+1; i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                if (haystack.substring(i, i + needle.length()).equals(needle)) {
                    return i;
                }
            }
        }
        return -1;
    }
}
