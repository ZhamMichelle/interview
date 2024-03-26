package kz.zhami.interview.binding;

public class CarInsurance extends Insurance {
    public static final int HIGH = 200;

    public int premium() {
        return HIGH;
    }

    public String category() {
        return "car insurance";
    }
}

//    Insurance insurance = new CarInsurance();

//        System.out.println(insurance.premium());
//        var str = insurance.category();
//        System.out.println(str);
//        System.out.println(insurance.category());
