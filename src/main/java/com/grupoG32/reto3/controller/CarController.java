package com.grupoG32.reto3.controller;

import com.grupoG32.reto3.dbo.AdminDbo;
import com.grupoG32.reto3.dbo.CarDbo;
import com.grupoG32.reto3.model.CarModel;
import com.grupoG32.reto3.service.AdminService;
import com.grupoG32.reto3.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/Car")
public class CarController {

    @Autowired
    CarService carService;
    @GetMapping("/all")
    public List<CarModel> obtener(){
        return carService.obtener();
    }
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public void crear(@RequestBody CarModel car){
        carService.crear(car);
    }
}
