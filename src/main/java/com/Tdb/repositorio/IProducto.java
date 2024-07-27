package com.tdb.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tdb.modelo.Producto;

public interface IProducto extends JpaRepository<Producto, Integer>{
    
}
