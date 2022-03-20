
package com.proyectoportfolio.primerportfolio.repository;

import com.proyectoportfolio.primerportfolio.model.Idiomas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IdiomasRepository extends JpaRepository<Idiomas,Long>{
    
}
