package br.com.kamehouse.pocobserverspring.controller;

import br.com.kamehouse.pocobserverspring.observer.EventOrquestratorImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
@RequiredArgsConstructor
public class Hello {

    private final EventOrquestratorImpl event;

    @GetMapping(path = "/execute")
    public ResponseEntity index(){
        Map<String, Object> pojo = new HashMap<>();
        pojo.put(UUID.randomUUID().toString(), UUID.randomUUID().toString());
        pojo.put(UUID.randomUUID().toString(), UUID.randomUUID().toString());
        pojo.put(UUID.randomUUID().toString(), UUID.randomUUID().toString());
        pojo.put("tempoInicio", LocalDateTime.now());
        pojo.put("tempoFim", LocalDateTime.now());
        this.event.notify(pojo);
        return ResponseEntity.ok("Deu certo...");
    }

}
