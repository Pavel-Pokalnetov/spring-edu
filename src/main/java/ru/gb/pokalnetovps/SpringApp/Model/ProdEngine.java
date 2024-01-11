package ru.gb.pokalnetovps.SpringApp.Model;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class ProdEngine implements Engine {
    public ProdEngine() {
        System.out.println("Двигатель запущен");
    }

    public void go() {
        System.out.println("Поехали быстро!");
    }

}
