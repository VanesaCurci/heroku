
package com.proyectoportfolio.primerportfolio.service;

import com.proyectoportfolio.primerportfolio.model.Contacto;
import com.proyectoportfolio.primerportfolio.repository.ContactoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ContactoService implements IContactoService{
    @Autowired
    private ContactoRepository contaRepository;

    @Override
    public List<Contacto> getContactos() {
      List<Contacto> listaContactos = contaRepository.findAll();
          return listaContactos;    
    }

    @Override
    public void saveContacto(Contacto conta) {
        contaRepository.save(conta);
    }

    @Override
    public void deleteContacto(Long id) {
        contaRepository.deleteById(id);
    }

    @Override
    public Contacto findContacto(Long id) {
        Contacto conta = contaRepository.findById(id).orElse(null);
        return conta;
    }
}
 

