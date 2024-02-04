package br.com.kamehouse.pocobserverspring.observer;

import java.util.Map;

public interface EventObserver {

    void update(Map<String, Object> pojo);

}
