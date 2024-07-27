package com.tdb.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tdb.modelo.HistorialDeCompras;

public interface IHistorialDeCompras extends JpaRepository<HistorialDeCompras, Integer>{
    
}
