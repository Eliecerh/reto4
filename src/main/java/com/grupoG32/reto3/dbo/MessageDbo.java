package com.grupoG32.reto3.dbo;

import com.grupoG32.reto3.model.CarModel;
import com.grupoG32.reto3.model.ClientModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@AllArgsConstructor
@NoArgsConstructor
public class MessageDbo {

    private int idMessage;
    private String messageText;
    private CarModel car;
    private ClientModel client;

}
