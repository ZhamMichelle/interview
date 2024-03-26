package kz.zhami.interview.proxy.bean;

import jakarta.annotation.PostConstruct;

import java.time.Duration;

public class Waiter implements IWaiter {
    private String name;

    public Waiter(String name) {
        this.name = name;
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("Waiter postConstruct.");
    }

    @Override
    public void serve(String customerName) {
        System.out.println(name + " is serving customer " + customerName);

        try {
            Thread.sleep(Duration.ofSeconds(5));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(name + " is free!");
    }
}
