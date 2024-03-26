package kz.zhami.interview.algorithms.another;

public class SlidingWindow_2 {
    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 2, 3, 2};
        int k = 7;
        System.out.println(getSmallestSubArraySum(arr, k));
    }

    public static int getSmallestSubArraySum(int[] arr, int s) {
        int windowSum = 0;
        int minLength = Integer.MAX_VALUE;
        int windowStart = 0;

        for(int windowEnd=0; windowEnd<arr.length;windowEnd++){
            windowSum += arr[windowEnd];
            while(windowSum >= s) {
                minLength = Math.min(minLength, windowEnd - windowStart + 1);
                windowSum -= arr[windowStart];
                windowStart++;
            }
        }
        if(minLength == Integer.MAX_VALUE) {
            return 0;
        }
        return minLength;
    }
}
