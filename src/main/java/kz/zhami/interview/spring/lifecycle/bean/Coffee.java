package kz.zhami.interview.spring.lifecycle.bean;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import lombok.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Coffee {

    private final String type;

    public Coffee(String type){
        this.type=type;
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("postConstruct -> make coffee with type: " + type);
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("preDestroy -> before destroy.");
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "type='" + type + '\'' +
                '}';
    }
}
