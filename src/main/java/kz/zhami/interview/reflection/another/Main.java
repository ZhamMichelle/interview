package kz.zhami.interview.reflection.another;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        int invocationCount = 20;
        Object[] booleans = new Object[invocationCount];
        Method method = Main.class.getMethod("f");

        for (int i = 0; i < invocationCount; i++) {
            booleans[i] = invoke(method);
        }
        Thread.sleep(3000);
    }

    public static Object invoke(Method method) throws Exception {
        return method.invoke(null);
    }

    public static boolean f() {
        return false;
    }
}
