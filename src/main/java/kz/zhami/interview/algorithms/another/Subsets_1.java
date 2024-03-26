package kz.zhami.interview.algorithms.another;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Subsets_1 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5};
        var list = findSubsets(arr);
        for(Integer[] i : list){
            System.out.println(Arrays.toString(i));
        }
    }

    public static ArrayList<Integer[]> findSubsets(int[] arr) {
        ArrayList<Integer[]> list = new ArrayList<>();
        list.add(new Integer[0]);
        for (int i = 0; i < arr.length; i++) {
            int size = list.size();
            for (int j = 0; j < size; j++) {
                var helper = Arrays.copyOf(list.get(j), list.get(j).length + 1);
                helper[list.get(j).length] = arr[i];
                list.add(helper);
            }
        }
        return list;
    }
}
