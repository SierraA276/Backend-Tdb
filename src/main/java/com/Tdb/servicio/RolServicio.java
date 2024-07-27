package com.tdb.servicio;

import com.tdb.repositorio.IRol;
import com.tdb.modelo.Rol;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RolServicio implements IRolServicio {

    @Autowired
    private IRol rolRepositorio;
    
    @Override
    public List<Rol> mostrarRoles() {
        return rolRepositorio.findAll();
    }

    @Override
    public Rol buscarRolPorId(Integer idRol) {
        return rolRepositorio.findById(idRol).orElse(null);
    }

    @Override
    public Rol guardarRol(Rol rol) {
        return rolRepositorio.save(rol);
    }

    @Override
    public void eliminarRol(Rol rol) {
        rolRepositorio.delete(rol);
    }
}
