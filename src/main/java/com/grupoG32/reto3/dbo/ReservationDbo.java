package com.grupoG32.reto3.dbo;

import com.grupoG32.reto3.model.CarModel;
import com.grupoG32.reto3.model.ClientModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;


@AllArgsConstructor
@NoArgsConstructor
public class ReservationDbo {

    private int idReservation;
    private Date startDate;
    private Date devolutionDate;
    private CarModel car;
    private ClientModel client;

}
