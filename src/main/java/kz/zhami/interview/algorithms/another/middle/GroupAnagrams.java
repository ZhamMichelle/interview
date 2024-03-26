package kz.zhami.interview.algorithms.another.middle;

import java.util.*;

public class GroupAnagrams {
    public static void main(String[] args) {
        String[] arr = {"listen", "silent", "enlist"};
        System.out.println(group(arr));
    }

    public static List<List<String>> group(String[] arr) {
        List<List<String>> groups = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        int counter = 0;

        for (int i = 0; i < arr.length; i++) {
            if (map.isEmpty()) {
                map.put(arr[i], counter++);
                groups.add(new ArrayList<>(Arrays.asList(arr[i])));
            } else {
                boolean isExist = false;
                for (Map.Entry<String, Integer> entry : map.entrySet()) {
                    if (isAnagram(entry.getKey(), arr[i])) {
                        isExist = true;
                        groups.get(entry.getValue()).add(arr[i]);
                        break;
                    }
                }
                if (!isExist) {
                    groups.add(new ArrayList<>(Arrays.asList(arr[i])));
                    map.put(arr[i], counter++);
                }
            }
        }
        return groups;
    }

    public static boolean isAnagram(String first, String second) {
        if (first.length() != second.length())
            return false;

        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < first.length(); i++) {
            if (map.get(first.charAt(i)) == null) {
                map.put(first.charAt(i), 1);
            } else {
                map.put(first.charAt(i), map.get(first.charAt(i)) + 1);
            }
        }

        for (int i = 0; i < first.length(); i++) {
            if (map.get(second.charAt(i)) == null) {
                return false;
            } else {
                if (map.get(second.charAt(i)) == 1) {
                    map.remove(second.charAt(i));
                } else {
                    map.put(second.charAt(i), map.get(second.charAt(i)) - 1);
                }
            }
        }
        return map.isEmpty();
    }
}
