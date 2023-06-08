package com.grupoG32.reto3.dbo;

import com.grupoG32.reto3.model.ReservationModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ScoreDbo {
    private Integer idScore;
    private Integer stars;

}
