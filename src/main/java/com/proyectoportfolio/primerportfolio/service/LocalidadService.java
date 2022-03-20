
package com.proyectoportfolio.primerportfolio.service;

import com.proyectoportfolio.primerportfolio.model.Localidad;
import com.proyectoportfolio.primerportfolio.repository.LocalidadRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LocalidadService implements ILocalidadService{
    @Autowired
    private LocalidadRepository locaRepository;

    @Override
    public List<Localidad> getLocalidades() {
      List<Localidad> listaLocalidades = locaRepository.findAll();
          return listaLocalidades;    
    }

    @Override
    public void saveLocalidad(Localidad loca) {
        locaRepository.save(loca);
    }

    @Override
    public void deleteLocalidad(Long id) {
        locaRepository.deleteById(id);
    }

    @Override
    public Localidad findLocalidad(Long id) {
        Localidad loca = locaRepository.findById(id).orElse(null);
        return loca;
    }
}
 