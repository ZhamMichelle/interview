package kz.zhami.interview.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("kz.zhami.interview.spring");

        long before = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            Quoter quoter = context.getBean(Quoter.class);
        }
        long after = System.nanoTime();
        System.out.println((after - before) / 1000000);

    }
}
