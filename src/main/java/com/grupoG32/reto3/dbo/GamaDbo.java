package com.grupoG32.reto3.dbo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.grupoG32.reto3.model.CarModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class GamaDbo {
    private Integer idGama;
    private String name;
    private String description;
    private List<CarModel> cars;
}
