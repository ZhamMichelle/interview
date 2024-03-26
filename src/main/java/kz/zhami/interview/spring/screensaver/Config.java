package kz.zhami.interview.spring.screensaver;

import kz.zhami.interview.spring.Quoter;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.*;

import java.awt.*;
import java.util.Random;

@Configuration
@ComponentScan(basePackages = "kz.zhami.interview.spring.screensaver")
public class Config {
    @Bean
    @Scope(value = "periodical")
    public Color color() {
        Random random = new Random();
        return new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
    }

    @Bean
    public ColorFrame frame() {
        return new ColorFrame() {
            @Override
            protected Color getColor() {
                return color();
            }
        };
    }

    public static void main(String[] args) throws InterruptedException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
//        while (true) {
//            context.getBean(ColorFrame.class).showOnRandomPlace();
//            Thread.sleep(50);
//        }

        ColorFrame frame = null;
        long before = System.nanoTime();
//        for (int i = 0; i < 1000000; i++) {
             context.getBean(ColorFrame.class);
//        }
        long after = System.nanoTime();
//        System.out.println((after - before) / 1000000);
        System.out.println(after - before);
//        System.out.println(frame);
    }
}
