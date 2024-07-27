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
public class Rol {
    
//    Aqui se encuentra el Id del rol para tener los roles por id y poder tener una facilidad a la hora de asignarlos 
//    a los usuarios y el nombre del rol
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idRol;
    private String nombre;
   
}

