package kz.zhami.interview;

import kz.zhami.interview.patterns.singleton.Singleton;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.kafka.core.KafkaTemplate;

import javax.swing.*;
import java.io.*;
import java.util.*;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class InterviewApplication {

    public static final void main(String[] args) throws IOException {

    }
}


class FirstThread extends Thread {
    @Override
    public void run() {
        Singleton s = Singleton.getInstance("FIRST");
        System.out.println(s.value);
    }
}

class SecondThread extends Thread {
    @Override
    public void run() {
        Singleton s = Singleton.getInstance("SECOND");
        System.out.println(s.value);
    }
}


class ThreadExample extends Thread {

    public ThreadExample() {
        this.start();
    }

    public void run() {

        System.out.println(Thread.currentThread().getName() + " уступает свое место другим");
        Thread.yield();
        System.out.println(Thread.currentThread().getName() + " has finished executing.");
    }

    public static void main(String[] args) {
        new ThreadExample();
        new ThreadExample();
        new ThreadExample();
    }
}

//    Stream<Phone> phoneStream = Stream.of(new Phone("iPhone X", "Apple", 600),
//            new Phone("Pixel 2", "Google", 500),
//            new Phone("iPhone 8", "Apple", 450),
//            new Phone("Galaxy S9", "Samsung", 440),
//            new Phone("Galaxy S8", "Samsung", 340));
//
//
//    Map<String, List<Phone>> phonesByCompany = phoneStream.collect(
//            Collectors.groupingBy(Phone::getCompany));
//
//        for (Map.Entry<String, List<Phone>> item : phonesByCompany.entrySet()) {
//
//        System.out.println(item.getKey());
//        for (Phone phone : item.getValue()) {
//
//        System.out.println(phone.getName());
//        }
//        System.out.println();
//        }

class Phone {

    private String name;
    private String company;
    private int price;

    public Phone(String name, String comp, int price) {
        this.name = name;
        this.company = comp;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public String getCompany() {
        return company;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}





