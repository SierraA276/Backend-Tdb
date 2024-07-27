package com.tdb.servicio;

import com.tdb.modelo.TopeGastosMensuales;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface ITopeGastosMensualesServicio {
    
    public List<TopeGastosMensuales> mostrarTopes();
    
    public TopeGastosMensuales buscarTopePorId(Integer idTope);
            
    public TopeGastosMensuales guardarTope(TopeGastosMensuales tope);
            
    public void eliminarTope(TopeGastosMensuales tope);
}
