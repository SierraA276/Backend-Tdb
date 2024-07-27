package com.tdb.servicio;

import com.tdb.modelo.HistorialDeCompras;
import java.util.List;

public interface IHistorialDeComprasServicio {
    
    public List<HistorialDeCompras> mostrarHistorial();
    
    public HistorialDeCompras buscarCompraPorId(Integer idCompra);
            
    public HistorialDeCompras guardarCompra(HistorialDeCompras compra);
            
    public void eliminarCompra(HistorialDeCompras compra);
}
