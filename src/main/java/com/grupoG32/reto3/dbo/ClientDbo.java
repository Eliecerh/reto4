package com.grupoG32.reto3.dbo;

import com.grupoG32.reto3.model.MessageModel;
import com.grupoG32.reto3.model.ReservationModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientDbo {

    private Integer idClient;
    private String email;
    private String password;
    private String name;
    private Byte age;
    private List<MessageModel> messages;
    private List<ReservationModel> reservations;
}
