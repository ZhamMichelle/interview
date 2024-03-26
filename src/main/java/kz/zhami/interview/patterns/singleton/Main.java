package kz.zhami.interview.patterns.singleton;

public class Main {
    public static void main(String[] args) {
        SingletonEnum singleton = SingletonEnum.INSTANCE;

        System.out.println(singleton.getValue());
        singleton.setValue(2);
        System.out.println(singleton.getValue());
        singleton.setValue(3);
        System.out.println(singleton.getValue());


    }
}
