package kz.zhami.interview.binding;

public class Insurance {
    public static final int LOW = 100;

    public int premium() {
        return LOW;
    }

    public String category() {
        return "insurance";
    }

    public String getName() {
        return String.class.getClassLoader().getName();
    }
}
