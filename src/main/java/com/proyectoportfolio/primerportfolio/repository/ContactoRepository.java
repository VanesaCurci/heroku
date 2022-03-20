
package com.proyectoportfolio.primerportfolio.repository;

import com.proyectoportfolio.primerportfolio.model.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactoRepository extends JpaRepository<Contacto,Long>{
    
}
