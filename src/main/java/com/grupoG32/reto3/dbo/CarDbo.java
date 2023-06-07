package com.grupoG32.reto3.dbo;

import com.grupoG32.reto3.model.GamaModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@AllArgsConstructor
@NoArgsConstructor
public class CarDbo {

    private int idCar;
    private String name;
    private String brand;
    private int year;
    private String description;

    private GamaModel gama;

}
