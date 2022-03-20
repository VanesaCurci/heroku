
package com.proyectoportfolio.primerportfolio.repository;

import com.proyectoportfolio.primerportfolio.model.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectoRepository extends JpaRepository<Proyecto,Long>{
    
}
