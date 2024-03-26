package kz.zhami.interview.algorithms.another;

public class ShortestWordDistance {
    public static void main(String[] args) {
        String[] words = {"the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        String word1 = "fox";
        String word2 = "dog";

        System.out.println(getShortestDistance(words, word1, word2));
    }

    public static int getShortestDistance(String[] words, String first, String second) {
        int left = 0;
        int right = words.length - 1;

        int leftMarker = left;
        int rightMarker = right;
        int distance = Integer.MAX_VALUE;
        while (left < words.length) {
            if (words[left].equals(first)) {
                leftMarker = left;
                distance = Math.min(distance, Math.abs(rightMarker - leftMarker));
            }
            left++;
            if (words[right].equals(second)) {
                rightMarker = right;
                distance = Math.min(distance, Math.abs(rightMarker - leftMarker));
            }
            right--;
        }
        return distance;
    }
}
