package kz.zhami.interview.jni;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hey! This is Java!");

        AwesomeLib nativeLib = new AwesomeLib();
        nativeLib.helloHabr();
    }
}
