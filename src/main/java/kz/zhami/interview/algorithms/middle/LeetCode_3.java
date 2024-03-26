package kz.zhami.interview.algorithms.middle;

import java.util.HashSet;
import java.util.Set;

public class LeetCode_3 {
    public static void main(String[] args) {
        String s = "pawwb";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0;
        int maxLen = 0;

        for (int right = 0; right < s.length(); right++) {
            if (!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                maxLen = Math.max(maxLen, right - left + 1);
            } else {
                while (set.contains(s.charAt(right))) {
                    set.remove(s.charAt(left));
                    left++;
                }
                set.add(s.charAt(right));
            }
        }

        return maxLen;
    }

//    public static int lengthOfLongestSubstring(String s) throws Exception {
//        char[] arr = s.toCharArray();
//        String[] strArr = new String[s.length()];
//        for (int i = 0; i < arr.length; i++) {
//            strArr[i] = s.substring(i);
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            int counter = 0;
//            for (int j = 1; j < strArr[i].length(); j++) {
//                counter = j;
//                if (strArr[i].charAt(0) == strArr[i].charAt(j)) {
//                    break;
//                }
//            }
//
//            int minus = 0;
//            for (int z = counter; z > 0; z--) {
//                for (int k = z - 1; k >= 0; k--) {
//                    if (strArr[i].charAt(z) == strArr[i].charAt(k))
//                        minus = z;
//                }
//            }
//            if (minus != 0) {
//                strArr[i] = strArr[i].substring(0, minus);
//            }
//        }
//
//        int helper=0;
//        for(int i=0; i<strArr.length;i++){
//            if(strArr[i].length()>helper)
//                helper=strArr[i].length();
//        }
//        return helper;
//    }
}
