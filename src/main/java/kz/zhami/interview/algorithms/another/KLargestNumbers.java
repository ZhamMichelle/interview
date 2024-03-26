package kz.zhami.interview.algorithms.another;

import java.util.*;
import java.util.stream.Collectors;

public class KLargestNumbers {
    public static void main(String[] args) {
        List<Integer> arr = List.of(2, 45, 8, 49, 36, 4, 1, 7);
        System.out.println(quickSort(arr, 3));
    }

    public static List<Integer> quickSort(List<Integer> arr, int k) {
        if(arr.size()==k) return arr;
        int pivot = arr.get(arr.size() - 1);
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();

        for (int i = 0; i < arr.size()-1; i++) {
            if (arr.get(i) < pivot) {
                left.add(arr.get(i));
            } else {
                right.add(arr.get(i));
            }
        }
        quickSort(right,k);
        return Collections.emptyList();
    }

    public static List<Integer> findTopK(List<Integer> input, int k) {
        List<Integer> arr = new ArrayList<>(input);

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            int index = 0;
            for (int j = 1; j < arr.size(); j++) {
                if (arr.get(j) > arr.get(index)) {
                    index = j;
                }
            }
            list.add(arr.get(index));
            arr.remove(index);
        }
        return list;
    }

    public static List<Integer> findTopK_1(List<Integer> input, int k) {
        TreeSet<Integer> treeSet = new TreeSet<>(Comparator.reverseOrder());
        treeSet.addAll(input);
        return treeSet.stream().limit(k).collect(Collectors.toList());
    }
}
