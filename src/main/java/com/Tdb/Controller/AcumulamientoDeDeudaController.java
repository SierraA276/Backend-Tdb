package com.tdb.Controller;

import com.tdb.modelo.AcumulamientoDeDeuda;
import com.tdb.servicio.IAcumulamientoDeDeudaServicio;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
/**
 * Controlador para manejar las solicitudes relacionadas con las deudas.
 */
@RestController
@RequestMapping("Ctr-Acumulamiento-Deuda")
@CrossOrigin(value = "https://localhost:3000/")
public class AcumulamientoDeDeudaController {
    
    private static final Logger logger = LoggerFactory.getLogger(AcumulamientoDeDeudaController.class);
    
    @Autowired
    private IAcumulamientoDeDeudaServicio deudaServicio;
    /**
     * Listar todas las deudas.
     * @return Lista de deudas.
     */
    @GetMapping("/deudas")
    public List<AcumulamientoDeDeuda> obtenerDeudas() {
        var deudas = deudaServicio.mostrarDeudas();
        deudas.forEach((deuda -> logger.info(deuda.toString())));
        return deudas;
    }
    

}
