package com.tdb.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tdb.modelo.AcumulamientoDeDeuda;

public interface IAcumulamientoDeDeuda extends JpaRepository<AcumulamientoDeDeuda, Integer>{
    
}
