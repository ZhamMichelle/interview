package kz.zhami.interview.algorithms.another;

import java.util.Set;

public class ReverseVowels {
    public static void main(String[] args) {
        String str = "DesignGUrus";
        System.out.println(reverse(str));
    }

    public static String reverse(String str) {
        Set<Character> set = Set.of('a', 'e', 'i', 'o', 'u','A','E','I','O','U');
        char[] arr = str.toCharArray();
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (set.contains(arr[left])) {
                if (set.contains(arr[right])) {
                    swap(arr, left, right);
                    left++;
                    right--;
                }
            } else {
                left++;
            }

            if (set.contains(arr[right])) {
                if (set.contains(arr[left])) {
                    swap(arr, left, right);
                    left++;
                    right--;
                }
            } else {
                right--;
            }
        }
        return new String(arr);
    }

    public static void swap(char[] arr, int left, int right) {
        char temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }
}
