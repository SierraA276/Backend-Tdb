package com.tdb.servicio;


import com.tdb.modelo.Producto;
import java.util.List;
import org.springframework.stereotype.Service;


/**
 * Interfaz para el servicio de productos.
 */
@Service
public interface IProductoServicio {
    
    public List<Producto> mostrarProductos();
    
    public Producto buscarProductoPorId(Integer idProducto);
            
    public Producto guardarProducto(Producto producto);
            
    public void eliminarProducto(Producto producto);
}
