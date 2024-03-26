package kz.zhami.interview.spring.lifecycle;

import kz.zhami.interview.spring.lifecycle.bean.CoffeeShop;
import kz.zhami.interview.spring.lifecycle.config.LifeCycleConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(LifeCycleConfiguration.class);
        CoffeeShop shop = context.getBean(CoffeeShop.class);
//        shop.makeCoffee();
//        shop.makeCoffee("Cappuccino");
            shop.makeCoffee("Latte", "milk");
        context.close();
    }
}
