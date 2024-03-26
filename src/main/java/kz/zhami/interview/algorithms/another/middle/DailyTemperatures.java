package kz.zhami.interview.algorithms.another.middle;

import java.util.Arrays;
import java.util.Stack;

public class DailyTemperatures {
    public static void main(String[] args) {
        int[] arr = {45, 50, 40, 60, 55};
        // 1 2 1 0 0
        System.out.println(Arrays.toString(getDays(arr)));
    }

    public static int[] getDays_1(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] days = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                days[stack.peek()] = i - stack.peek();
                stack.pop();
            }
            stack.push(i);
        }
        return days;
    }


    public static int[] getDays(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int[] days = new int[arr.length];
        Arrays.fill(days, 0);

        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] < arr[i]) {
                days[stack.peek()] = i - stack.peek();
                stack.pop();
            }
            stack.push(i);
        }
        return days;
    }
}
