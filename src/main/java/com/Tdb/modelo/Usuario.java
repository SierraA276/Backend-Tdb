
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
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idUsuario;
    String nombreUsuario;
    String apellidoUsuario;
    String emailUsuario;
    //Aqui se deben agregar los valores realcionados a usuarios como
    //Deuda maxima, tope mensual, historial de compras,rol y así
    
    
}
