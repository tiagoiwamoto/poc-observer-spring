package br.com.kamehouse.pocobserverspring.observer;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Component
@RequiredArgsConstructor
public class EventOrquestratorImpl implements EventOrquestrator {

    private final List<EventObserver> observers;

//    @Override
//    public void register(EventObserver observer) {
//        observers.add(observer);
//    }
//
//    @Override
//    public void remove(EventObserver observer) {
//        observers.remove(observer);
//    }

    @Override
    public void notify(Map<String, Object> pojo) {
        observers.parallelStream().forEach(item -> item.update(pojo));
    }

}
