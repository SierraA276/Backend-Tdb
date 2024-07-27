package com.tdb.servicio;

import com.tdb.modelo.Rol;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface IRolServicio {
    
    public List<Rol> mostrarRoles();
    
    public Rol buscarRolPorId(Integer idRol);
            
    public Rol guardarRol(Rol rol);
            
    public void eliminarRol(Rol rol);
}
