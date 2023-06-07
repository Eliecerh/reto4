package com.grupoG32.reto3.dbo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@AllArgsConstructor
@NoArgsConstructor
public class ClientDbo {

    private int idClient;
    private String name;
    private String email;
    private String password;
    private byte age;
}
