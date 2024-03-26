package kz.zhami.interview.proxy;

import kz.zhami.interview.proxy.bean.Customer;
import kz.zhami.interview.proxy.bean.IWaiter;
import kz.zhami.interview.proxy.bean.Waiter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("kz.zhami.interview.proxy")
public class ApplicationConfig {

    @Bean
    public IWaiter jhon(){
        return new Waiter("John");
    }

    @Bean
    public Customer andrew(){
        return new Customer("Andrew");
    }

    @Bean
    public Customer julia(){
        return new Customer("Julia");
    }

    @Bean
    public Customer nina(){
        return new Customer("Nina");
    }
}
