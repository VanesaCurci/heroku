package com.proyectoportfolio.primerportfolio.service;

import com.proyectoportfolio.primerportfolio.model.Proyecto;
import com.proyectoportfolio.primerportfolio.repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProyectoService implements IProyectoService{
    @Autowired
    private ProyectoRepository proyeRepository;

    @Override
    public List<Proyecto> getProyectos() {
      List<Proyecto> listaProyectos = proyeRepository.findAll();
          return listaProyectos;    
    }

    @Override
    public void saveProyecto(Proyecto proye) {
        proyeRepository.save(proye);
    }

    @Override
    public void deleteProyecto(Long id) {
        proyeRepository.deleteById(id);
    }

    @Override
    public Proyecto findProyecto(Long id) {
        Proyecto proye = proyeRepository.findById(id).orElse(null);
        return proye;
    }

   
}
 
