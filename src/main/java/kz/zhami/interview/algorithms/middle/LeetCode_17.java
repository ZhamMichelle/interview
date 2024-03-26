package kz.zhami.interview.algorithms.middle;

import javax.xml.stream.events.Characters;
import java.util.*;

public class LeetCode_17 {
    public static void main(String[] args) {
        var list = letterCombinations("23");

        System.out.println(list);
    }

    public static List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) return Collections.emptyList();

        String[] phone_map = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> output = new ArrayList<>();
        backtrack("", digits, phone_map, output);
        return output;
    }

    private static void backtrack(String combination, String next_digits, String[] phone_map, List<String> output) {
        if (next_digits.isEmpty()) {
            output.add(combination);
        } else {
            var letters = phone_map[Character.getNumericValue(next_digits.charAt(0)) - 2];
            for (char letter : letters.toCharArray()) {
                backtrack(combination + letter, next_digits.substring(1), phone_map, output);
            }
        }
    }
}
