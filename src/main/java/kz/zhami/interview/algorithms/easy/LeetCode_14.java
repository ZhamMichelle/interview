package kz.zhami.interview.algorithms.easy;

public class LeetCode_14 {
    public static void main(String[] args) {
        String[] strs = {"ab", "a"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        var shortWordIndex = strs[0].length();
        String curWord = strs[0];
        for (int i = 1; i < strs.length; i++) {
            if (strs[i].length() < shortWordIndex)
                shortWordIndex = strs[i].length();
            curWord=strs[i];
        }

        if(curWord.equals("")) return "";
        var curCount = 0;
        var helper = strs[0].length();
        for (int i = 0; i < strs.length; i++) {
            curCount=0;
            if (strs[i].equals(curWord)) continue;
            for (int j = 0; j < strs[i].length(); j++) {
                if (curWord.charAt(j) != strs[i].charAt(j)) {
                    break;
                }
                curCount++;
            }
            if (curCount < helper)
                helper = curCount==0 ? curCount : curCount + 1;
        }
        return curWord.substring(0, helper);
    }
}
