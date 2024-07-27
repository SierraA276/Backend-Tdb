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
public class HistorialDeCompras {
//    Aqui se tiene el id de compra para saber a que compra se hace referencia, la factura, el id del usuario y los id de los productos para 
//    Sabes q eu productos se hace referencia, la cantidad de los productos que se compraron y el valor unitario por producto
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCompra;
    private String factura;
    private Integer idUsuario;
    private Integer idProducto;
    private Integer cantidad;
    private BigDecimal precioUnitario;
   
}
