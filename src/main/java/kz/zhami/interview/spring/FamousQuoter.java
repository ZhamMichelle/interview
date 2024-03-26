package kz.zhami.interview.spring;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
@Profiling
@DeprecatedClass(newImpl = T1000.class)
public class FamousQuoter implements Quoter {

    @RandomInjectedValue(min = 2, max = 7)
    private int counter;

    @PostConstruct
    public void init() {
        System.out.println("Phase2: " + counter);
    }

    public FamousQuoter() {
        System.out.println("Phase1: " + counter);
    }

    @Override
    @PostProxy
    public void getMessage() {
        System.out.println("Phase3: " + counter);
        for (int i = 0; i < counter; i++) {
            System.out.println("I will be back!");
        }
    }
}
