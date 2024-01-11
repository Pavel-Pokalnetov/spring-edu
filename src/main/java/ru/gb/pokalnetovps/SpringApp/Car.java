package ru.gb.pokalnetovps.SpringApp;

public class Car {
    Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
        engine.go();
    }
}
