package com.tdb.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TopeGastosMensuales {
    //  Las siguinetes varaibles son IdTope usado para la identifiacion del tope al que se hace referencia y vincularlo con un usuario
//  se tiene el IdUsuario para relacionarlo ambos id y se tiene el tope mensual
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTope;
    private Integer idUsuario;
    private Double topeMensual;
   
}

