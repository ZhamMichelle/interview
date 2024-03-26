package kz.zhami.interview.algorithms.another;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

public class MergeOverlapInterval_2 {
    public static void main(String[] args) {
        Interval_2[] arr = new Interval_2[3];
        arr[0] = new Interval_2(2, 5);
        arr[1] = new Interval_2(1, 4);
        arr[2] = new Interval_2(7, 9);

        mergeOverlappingInterval(arr);
    }

    public static void mergeOverlappingInterval(Interval_2[] arr) {
        Arrays.sort(arr, (first, second) -> first.start - second.start);

        Stack<Interval_2> stack = new Stack<>();
        stack.push(arr[0]);

        for (int i = 1; i < arr.length; i++) {
            Interval_2 top = stack.peek();

            if (top.end < arr[i].start) {
                stack.push(arr[i]);
            } else if (top.end < arr[i].end) {
                top.end=arr[i].end;
                stack.pop();
                stack.push(top);
            }
        }
        while(!stack.isEmpty()){
            var helper = stack.pop();
            System.out.println(helper.start + " : " + helper.end);
        }
    }

}

class Interval_2 {
    int start;
    int end;

    public Interval_2(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

