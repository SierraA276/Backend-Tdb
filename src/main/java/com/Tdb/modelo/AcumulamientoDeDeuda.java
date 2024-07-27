package com.tdb.modelo;

import jakarta.persistence.*;
import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AcumulamientoDeDeuda {
//    Aqui se tiene el id de la deuda, el id del usuario para identificar a quien pertenece la deuda y se tiene el acumulamiento maximo de la deuda 
//    permitida a dicho usuario
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDeuda;
    private Integer idUsuario;
    private BigDecimal acumulamientoMaximo;
   
}
