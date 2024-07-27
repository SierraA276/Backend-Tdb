package com.tdb.controlador;

import com.tdb.modelo.Rol;
import com.tdb.servicio.IRolServicio;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Controlador para manejar las solicitudes relacionadas con los roles.
 */
@RestController
@RequestMapping("Ctr-Rol")
@CrossOrigin(value = "https://localhost:3000/")
public class RolController {
    
    private static final Logger logger = LoggerFactory.getLogger(RolController.class);
    
    @Autowired
    private IRolServicio rolServicio;
    /**
     * Listar todos los roles.
     * @return Lista de roles.
     */
    @GetMapping("/roles")
    public List<Rol> obtenerRoles() {
        var roles = rolServicio.mostrarRoles();
        roles.forEach((rol -> logger.info(rol.toString())));
        return roles;
    }
    

}
