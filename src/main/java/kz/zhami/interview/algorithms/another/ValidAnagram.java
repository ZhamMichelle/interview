package kz.zhami.interview.algorithms.another;

import java.util.HashSet;
import java.util.Set;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "rat";
        String t = "car";
        System.out.println(isValidAnagram(s,t));
    }

    public static boolean isValidAnagram(String s, String t){
        Set<Character> set = new HashSet<>();
        for(Character c : s.toCharArray()){
            set.add(c);
        }

        for(Character c : t.toCharArray()){
            if(!set.contains(c))
                return false;
        }
        return true;
    }
}
