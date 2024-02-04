package br.com.kamehouse.pocobserverspring.observer;

import java.util.Map;

public interface EventOrquestrator {

//    void register(EventObserver observer);
//    void remove(EventObserver observer);
    void notify(Map<String, Object> pojo);
}
