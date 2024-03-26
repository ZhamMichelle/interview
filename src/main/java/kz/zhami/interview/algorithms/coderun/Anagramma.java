package kz.zhami.interview.algorithms.coderun;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Anagramma {
    public static void main(String[] args) {
        String a = "bred";
        String b = "redb";
        System.out.println(isEqualContaining(a, b));
    }

    public static boolean isEqualContaining(String a, String b) {
        var aMap = getDict(a);
        var bMap = getDict(b);
        return aMap.equals(bMap);
    }

    public static Map<Character, Integer> getDict(String a) {
        var dict = new HashMap<Character, Integer>();

        for (char c : a.toCharArray()) {
            if (dict.containsKey(c)) {
                dict.put(c,dict.get(c) + 1);
            } else {
                dict.put(c, 1);
            }
        }
        return dict;
    }
}
