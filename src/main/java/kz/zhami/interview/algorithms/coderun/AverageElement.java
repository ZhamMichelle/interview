package kz.zhami.interview.algorithms.coderun;

import java.util.Arrays;

public class AverageElement {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1};
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i]>arr[i+1]){
                int tmp = arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=tmp;
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
