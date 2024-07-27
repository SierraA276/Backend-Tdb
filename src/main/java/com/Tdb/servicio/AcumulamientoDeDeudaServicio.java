package com.tdb.servicio;

import com.tdb.repositorio.IAcumulamientoDeDeuda;
import com.tdb.modelo.AcumulamientoDeDeuda;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AcumulamientoDeDeudaServicio implements IAcumulamientoDeDeudaServicio {

    @Autowired
    private IAcumulamientoDeDeuda deudaRepositorio;
    
    @Override
    public List<AcumulamientoDeDeuda> mostrarDeudas() {
        return deudaRepositorio.findAll();
    }

    @Override
    public AcumulamientoDeDeuda buscarDeudaPorId(Integer idDeuda) {
        return deudaRepositorio.findById(idDeuda).orElse(null);
    }

    @Override
    public AcumulamientoDeDeuda guardarDeuda(AcumulamientoDeDeuda deuda) {
        return deudaRepositorio.save(deuda);
    }

    @Override
    public void eliminarDeuda(AcumulamientoDeDeuda deuda) {
        deudaRepositorio.delete(deuda);
    }
}
