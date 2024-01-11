package ru.gb.pokalnetovps.SpringApp.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.gb.pokalnetovps.SpringApp.Model.Car;

@RestController
public class CarController {
    @Autowired
    Car car;

    @GetMapping("/car")
    public String startCar(){
        car.start();
        return "Автомобиль запущен";
    }
}
