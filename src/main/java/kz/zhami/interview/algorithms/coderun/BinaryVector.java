package kz.zhami.interview.algorithms.coderun;

public class BinaryVector {
    public static void main(String[] args) {
        int[] arr = {};
        int counter = 0;
        int best = 0;
        for (int a : arr) {
            if (a > 0) {
                counter++;
                best = Math.max(best, counter);
            } else {
                counter = 0;
            }
        }
        System.out.println(best);
    }
}
