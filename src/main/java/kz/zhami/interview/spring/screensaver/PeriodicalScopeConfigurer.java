package kz.zhami.interview.spring.screensaver;


import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

public class PeriodicalScopeConfigurer implements Scope {
    Map<String, HashMap<LocalTime, Object>> map = new HashMap<>();

    @Override
    public Object get(String name, ObjectFactory<?> objectFactory) {
        if (map.containsKey(name)) {
            HashMap<LocalTime, Object> pair = map.get(name);
            int secondsSinceLastRequest = LocalTime.now().getSecond() - pair.keySet().stream().findFirst().get().getSecond();
            if (secondsSinceLastRequest < 5) {
                var m = new HashMap<LocalTime, Object>();
                m.put(LocalTime.now(), objectFactory.getObject());
                map.put(name, m);
            }
        } else {
            var m = new HashMap<LocalTime, Object>();
            m.put(LocalTime.now(), objectFactory.getObject());
            map.put(name, m);
        }
        return null;
    }

    @Override
    public Object remove(String name) {
        return null;
    }

    @Override
    public void registerDestructionCallback(String name, Runnable callback) {

    }

    @Override
    public Object resolveContextualObject(String key) {
        return null;
    }

    @Override
    public String getConversationId() {
        return null;
    }
}
