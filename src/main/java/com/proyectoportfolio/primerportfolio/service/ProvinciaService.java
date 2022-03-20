package com.proyectoportfolio.primerportfolio.service;

import com.proyectoportfolio.primerportfolio.model.Provincia;
import com.proyectoportfolio.primerportfolio.repository.ProvinciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProvinciaService implements IProvinciaService{
    @Autowired
    private ProvinciaRepository proviRepository;

    @Override
    public List<Provincia> getProvincias() {
      List<Provincia> listaProvincias = proviRepository.findAll();
          return listaProvincias;    
    }

    @Override
    public void saveProvincia(Provincia provi) {
        proviRepository.save(provi);
    }

    @Override
    public void deleteProvincia(Long id) {
        proviRepository.deleteById(id);
    }

    @Override
    public Provincia findProvincia(Long id) {
        Provincia provi = proviRepository.findById(id).orElse(null);
        return provi;
    }
}
 