
package com.proyectoportfolio.primerportfolio.service;

import com.proyectoportfolio.primerportfolio.model.Educación;
import com.proyectoportfolio.primerportfolio.repository.EducaciónRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EducaciónService implements IEducaciónService{
    @Autowired
    private EducaciónRepository eduRepository;

    @Override
    public List<Educación> getEducaciones() {
      List<Educación> listaEducaciones = eduRepository.findAll();
          return listaEducaciones;    
    }

    @Override
    public void saveEducación(Educación educa) {
        eduRepository.save(educa);
    }

    @Override
    public void deleteEducación(Long id) {
        eduRepository.deleteById(id);
    }

    @Override
    public Educación findEducación(Long id) {
        Educación edu = eduRepository.findById(id).orElse(null);
        return edu;
    }
}
 
