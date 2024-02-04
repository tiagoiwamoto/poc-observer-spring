package br.com.kamehouse.pocobserverspring.usecase;

import br.com.kamehouse.pocobserverspring.observer.EventObserver;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class MyRuleUsecase implements EventObserver {
    @Override
    public void update(Map<String, Object> pojo) {
        System.out.println("Vou fazer minha regra de negócio...");
    }
}
