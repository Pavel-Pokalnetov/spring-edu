package ru.gb.pokalnetovps.SpringApp.Model;

import org.springframework.stereotype.Service;

@Service
public class Car {
    Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
        engine.go();
    }
}
