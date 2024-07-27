package com.tdb.servicio;

import com.tdb.repositorio.IProducto;
import com.tdb.modelo.Producto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 * Implementación del servicio de productos.
 */
@Service
public class ProductoServicio implements IProductoServicio {

    @Autowired
    private IProducto productoRepositorio;
    
    /**
     * Listar todos los productos.
     * @return Lista de productos.
     */
    @Override
    public List<Producto> mostrarProductos() {
        return productoRepositorio.findAll();
    }

    /**
     * Buscar producto con id
   **/
    @Override
    public Producto buscarProductoPorId(Integer idProducto) {
        return productoRepositorio.findById(idProducto).orElse(null);
    }

    @Override
    public Producto guardarProducto(Producto producto) {
        return productoRepositorio.save(producto);
    }

    @Override
    public void eliminarProducto(Producto producto) {
        productoRepositorio.delete(producto);
    }
}
