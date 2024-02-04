package br.com.kamehouse.pocobserverspring.metric;

import br.com.kamehouse.pocobserverspring.observer.EventObserver;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class MetricRule implements EventObserver {
    @Override
    public void update(Map<String, Object> pojo) {
        System.out.println("Vou gerar métricas customizadas...");
    }
}
