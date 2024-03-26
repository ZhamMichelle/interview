package kz.zhami.interview.algorithms.coderun;

import java.util.ArrayList;
import java.util.List;

public class BracketSequence {
    public static void main(String[] args) {
        int n = 3;
        List<String> list = new ArrayList<>();
        System.out.println(generate("", 0, 0, n, list));
        System.out.println(list);
    }

    public static String generate(String str, int open, int closed, int n, List list) {
        if (str.length() == 2 * n) {
            list.add(str);
            return str;
        }

        if (open < n) {
            generate(str + "(", open + 1, closed, n, list);
        }
        if (closed < open) {
            generate(str + ")", open, closed + 1, n, list);

        }
        return str;
    }

}
