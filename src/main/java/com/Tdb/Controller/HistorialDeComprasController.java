package com.tdb.controller;

import com.tdb.modelo.HistorialDeCompras;
import com.tdb.servicio.IHistorialDeComprasServicio;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * Controlador para manejar las solicitudes relacionadas con el historial de compras.
 */
@RestController
@RequestMapping("Ctr-Historial-Compras")
@CrossOrigin(value = "https://localhost:3000/")
public class HistorialDeComprasController {
    
    private static final Logger logger = LoggerFactory.getLogger(HistorialDeComprasController.class);
    
    @Autowired
    private IHistorialDeComprasServicio historialServicio;
    /**
     * Listar todo el historial de compras.
     * @return Lista del historial de compras.
     */
    @GetMapping("/compras")
    public List<HistorialDeCompras> obtenerCompras() {
        var compras = historialServicio.mostrarHistorial();
        compras.forEach((compra -> logger.info(compra.toString())));
        return compras;
    }
    
   
}
