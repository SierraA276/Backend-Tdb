package com.tdb.controller;

import com.tdb.modelo.TopeGastosMensuales;
import com.tdb.servicio.ITopeGastosMensualesServicio;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("Ctr-Tope-Gastos-Mensuales")
@CrossOrigin(value = "https://localhost:3000/")
public class TopeGastosMensualesController {
    
    private static final Logger logger = LoggerFactory.getLogger(TopeGastosMensualesController.class);
    
    @Autowired
    private ITopeGastosMensualesServicio topeServicio;
    
    @GetMapping("/topes")
    public List<TopeGastosMensuales> obtenerTopes() {
        var topes = topeServicio.mostrarTopes();
        topes.forEach((tope -> logger.info(tope.toString())));
        return topes;
    }
    
  
}
