package kz.zhami.interview.spring.lifecycle.bean;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class CoffeeShop {
    private final Map<String, Ingredient> ingredients;
    private final ObjectProvider<Coffee> coffeeObjectProvider;

    public CoffeeShop(Map<String, Ingredient> ingredients, ObjectProvider<Coffee> coffeeObjectProvider) {
        this.ingredients = ingredients;
        this.coffeeObjectProvider = coffeeObjectProvider;
    }

    @PostConstruct
    public void openShop() {
        System.out.println("Shop is open");
    }

    public void makeCoffee() {
        System.out.println("Coffee is making.");
    }

    public void makeCoffee(String type){
        Coffee coffee = coffeeObjectProvider.getObject(type);
        System.out.println("Coffee is making: " + coffee);
    }

    public void makeCoffee(String type, String ingredient){
        Coffee coffee = coffeeObjectProvider.getObject(type);
        System.out.println("Coffee is making with ingredient: " + ingredients.get(ingredient) + ". Coffee " + coffee);
    }

    @PreDestroy
    public void closeShop() {
        System.out.println("Coffee is closing.");
    }
}
