package com.tdb.controller;

import com.tdb.modelo.Producto;
import com.tdb.servicio.IProductoServicio;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * Controlador para manejar las solicitudes relacionadas con los productos.
 */
@RestController
@RequestMapping("ctr-producto")
@CrossOrigin(value = "https://localhost:3000/")
public class ProductoController {
    
    private static final Logger logger = LoggerFactory.getLogger(ProductoController.class);
    
    @Autowired
    private IProductoServicio productoServicio;
    
    
    /**
     * Listar todos los productos.
     * @return Lista de productos.
     */
    @GetMapping("/productos")
    public List<Producto> obtenerProductos() {
        var productos = productoServicio.mostrarProductos();
        productos.forEach((producto -> logger.info(producto.toString())));
        return productos;
    }
    

}
