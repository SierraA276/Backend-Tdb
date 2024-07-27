package com.tdb.servicio;

import com.tdb.repositorio.IHistorialDeCompras;
import com.tdb.modelo.HistorialDeCompras;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HistorialDeComprasServicio implements IHistorialDeComprasServicio {

    @Autowired
    private IHistorialDeCompras historialRepositorio;
    
    @Override
    public List<HistorialDeCompras> mostrarHistorial() {
        return historialRepositorio.findAll();
    }

    @Override
    public HistorialDeCompras buscarCompraPorId(Integer idCompra) {
        return historialRepositorio.findById(idCompra).orElse(null);
    }

    @Override
    public HistorialDeCompras guardarCompra(HistorialDeCompras compra) {
        return historialRepositorio.save(compra);
    }

    @Override
    public void eliminarCompra(HistorialDeCompras compra) {
        historialRepositorio.delete(compra);
    }
}
