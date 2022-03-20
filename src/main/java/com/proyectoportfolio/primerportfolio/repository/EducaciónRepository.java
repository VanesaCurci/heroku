
package com.proyectoportfolio.primerportfolio.repository;

import com.proyectoportfolio.primerportfolio.model.Educación;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducaciónRepository extends JpaRepository<Educación,Long>{
    
}
