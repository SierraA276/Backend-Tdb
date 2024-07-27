package com.tdb.servicio;

import com.tdb.modelo.AcumulamientoDeDeuda;
import java.util.List;

public interface IAcumulamientoDeDeudaServicio {
    
    public List<AcumulamientoDeDeuda> mostrarDeudas();
    
    public AcumulamientoDeDeuda buscarDeudaPorId(Integer idDeuda);
            
    public AcumulamientoDeDeuda guardarDeuda(AcumulamientoDeDeuda deuda);
            
    public void eliminarDeuda(AcumulamientoDeDeuda deuda);
}
