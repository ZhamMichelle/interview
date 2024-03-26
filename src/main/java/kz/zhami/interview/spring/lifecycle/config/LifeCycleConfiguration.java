package kz.zhami.interview.spring.lifecycle.config;

import kz.zhami.interview.spring.lifecycle.bean.CoffeeShop;
import kz.zhami.interview.spring.lifecycle.bean.IngredientFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("kz.zhami.interview.spring.lifecycle")
public class LifeCycleConfiguration {

//    @Bean(initMethod = "openShop", destroyMethod = "closeShop")
//    public CoffeeShop coffeeShop(){
//        return new CoffeeShop();
//    }

    @Bean
    public IngredientFactoryBean sugar(){
        return new IngredientFactoryBean("sugar");
    }

    @Bean
    public IngredientFactoryBean milk(){
        return new IngredientFactoryBean("milk");
    }
}
