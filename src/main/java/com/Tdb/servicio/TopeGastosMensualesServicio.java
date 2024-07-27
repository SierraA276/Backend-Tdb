package com.tdb.servicio;

import com.tdb.repositorio.ITopeGastosMensuales;
import com.tdb.modelo.TopeGastosMensuales;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopeGastosMensualesServicio implements ITopeGastosMensualesServicio {

    @Autowired
    private ITopeGastosMensuales topeRepositorio;
    
    @Override
    public List<TopeGastosMensuales> mostrarTopes() {
        return topeRepositorio.findAll();
    }

    @Override
    public TopeGastosMensuales buscarTopePorId(Integer idTope) {
        return topeRepositorio.findById(idTope).orElse(null);
    }

    @Override
    public TopeGastosMensuales guardarTope(TopeGastosMensuales tope) {
        return topeRepositorio.save(tope);
    }

    @Override
    public void eliminarTope(TopeGastosMensuales tope) {
        topeRepositorio.delete(tope);
    }
}
