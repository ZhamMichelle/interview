//https://www.designgurus.io/course-play/grokking-the-coding-interview/doc/63ddad31ff57d05f33aceba8
package kz.zhami.interview.algorithms.another;

public class TwoPointers_2 {
    public static void main(String[] args) {
        int[] arr = {-3, -1, 1, 2};
        int n = 1;
        System.out.println(getTripleSum_1(arr, n));
    }

    public static int getTripleSum_1(int[] arr, int targetSum) {
        int smallestValue = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 2; i++) {
            int left = i + 1;
            int right = arr.length - 1;
            while (left < right) {
                int dif = targetSum - arr[i] - arr[left] - arr[right];
                if (dif == 0)
                    return targetSum;
                if (Math.abs(dif) < Math.abs(smallestValue)) {
                    smallestValue = dif;
                }

                if (smallestValue > 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return targetSum - smallestValue;
    }

    public static int getTripleSum(int[] arr, int targetSum) {
        int smallestDifference = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length - 2; i++) {
            int left = i + 1, right = arr.length - 1;
            while (left < right) {
                int targetDiff = targetSum - arr[i] - arr[left] - arr[right];
                if (targetDiff == 0)
                    return targetSum;

                if (Math.abs(targetDiff) < Math.abs(smallestDifference)
                        || (Math.abs(targetDiff) == Math.abs(smallestDifference)
                        && targetDiff > smallestDifference))
                    smallestDifference = targetDiff;

                if (targetDiff > 0)
                    left++;
                else
                    right--;
            }
        }
        return targetSum - smallestDifference;
    }
}
