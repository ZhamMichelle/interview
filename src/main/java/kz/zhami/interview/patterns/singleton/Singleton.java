package kz.zhami.interview.patterns.singleton;

import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.io.Serial;
import java.io.Serializable;

@Controller
public class Singleton implements Serializable {
    private static volatile Singleton instance;
    public String value;

    private Singleton(String value) {
        this.value = value;
    }


    public static Singleton getInstance(String value) {
        Singleton result = instance;
        if (result != null) {
            return result;
        }
        synchronized (Singleton.class) {
            if (instance == null) {
                instance = new Singleton(value);
            }
            return instance;
        }

    }

    @Serial
    protected Object readResolve() {
        return instance;
    }

}
