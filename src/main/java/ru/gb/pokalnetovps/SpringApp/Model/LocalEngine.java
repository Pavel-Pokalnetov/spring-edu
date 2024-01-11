package ru.gb.pokalnetovps.SpringApp.Model;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Primary
@Profile("local")
public class LocalEngine implements Engine {
    public LocalEngine() {
        System.out.println("Двигатель запущен");
    }

    public void go() {
        System.out.println("Поехали медленно!");
    }

}
