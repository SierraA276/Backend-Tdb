package com.tdb.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.tdb.modelo.Rol;

public interface IRol extends JpaRepository<Rol, Integer>{
    
}
