package kz.zhami.interview.lifecoding;

import java.util.Random;
import java.util.stream.Stream;

public class ContiniousCycle {
    public static void main(String[] args) {
//        loop1:
//        for (int i = 0; i < 5; i++) {
//            for (int j = 0; j < 5; j++) {
//                if (i == 3)
//                    break loop1;
//                System.out.println("i = " + i + " j = " + j);
//            }
//        }

        var d = Stream.of(2,5,8,7,9)
                .mapToInt(s->s)
                .sum();
        System.out.println(d);
    }
}
