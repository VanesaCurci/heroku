package com.proyectoportfolio.primerportfolio.service;

import com.proyectoportfolio.primerportfolio.model.Idioma;
import com.proyectoportfolio.primerportfolio.repository.IdiomaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class IdiomaService implements IIdiomaService{
    @Autowired
    private IdiomaRepository idiRepository;

    @Override
    public List<Idioma> getIdiomas() {
      List<Idioma> listaIdiomas = idiRepository.findAll();
          return listaIdiomas;    
    }

    @Override
    public void saveIdioma(Idioma idi) {
       idiRepository.save(idi);
    }

    @Override
    public void deleteIdioma(Long id) {
        idiRepository.deleteById(id);
    }

    @Override
    public Idioma findIdioma(Long id) {
        Idioma idi = idiRepository.findById(id).orElse(null);
        return idi;
    }
}
 

