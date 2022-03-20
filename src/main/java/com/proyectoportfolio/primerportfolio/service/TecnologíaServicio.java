
package com.proyectoportfolio.primerportfolio.service;


import com.proyectoportfolio.primerportfolio.model.Tecnología;
import com.proyectoportfolio.primerportfolio.repository.TecnologíaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TecnologíaServicio implements ITecnologíaServicio{
    @Autowired
    private TecnologíaRepository tecnoRepository;

    @Override
    public List<Tecnología> getTecnologías() {
        List<Tecnología> listaTecnologías = tecnoRepository.findAll();
        return listaTecnologías;
    }

    @Override
    public void saveTecnología(Tecnología tecno) {
        tecnoRepository.save(tecno);
    }

    @Override
    public void deleteTecnología(Long id) {
        tecnoRepository.deleteById(id);
    }
    @Override
     public Tecnología findTecnología (Long id){
        Tecnología tecno = tecnoRepository.findById(id).orElse(null);
        return tecno;
    }
    
}
