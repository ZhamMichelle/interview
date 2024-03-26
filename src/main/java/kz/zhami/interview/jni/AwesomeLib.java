package kz.zhami.interview.jni;

public class AwesomeLib {
    static {
        System.loadLibrary("nativeLib");
    }

    public native void helloHabr();
}
