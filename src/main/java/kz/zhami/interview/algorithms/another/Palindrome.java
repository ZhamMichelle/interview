package kz.zhami.interview.algorithms.another;

public class Palindrome {
    public static void main(String[] args) {
        String str = "Was it a car or a cat I saw?";
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        int left = 0;
        int right = str.length() - 1;

        System.out.println(right);
        while (left <= right) {
            while (!Character.isLetter(str.charAt(left))) {
                left++;
            }
            while (!Character.isLetter(str.charAt(right))) {
                right--;
            }

            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
